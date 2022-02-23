import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeitorDeArquivos {
	public static void main(String[] args) {
		try {
			// a classe File indica que eu preciso manipular aquele arquivo com o nome
			// ALUNOS.TXT
			File arquivo = new File("./alunos.txt");

			// com a classe FileReader eu vou manipular este arquivo para LEITURA
			FileReader leitor = new FileReader(arquivo);
			
			/* possíveis variações 
			 *  FileReader leitor = new FileReader("./alunos.txt");
			 *  
			 *  FileReader leitor = new FileReader(new File("./alunos.txt"));			 * 
			 */

			// agora preciso fazer as leituras
			BufferedReader br = new BufferedReader(leitor);

			String dadosAluno = "";
			do {
				dadosAluno = br.readLine();

				// agora que vem a parte massa
				// a partir da linha obtida no arquivo, vou criar um novo aluno
				if (dadosAluno != null) {
					try {
						Aluno a = FabricaDeAlunos.criarAlunoFromCSV(dadosAluno);
						System.out.println(a);
					} catch (DadosAlunoException | CSVFormatException ex) {
						System.err.println("Erro ao criar aluno! " + ex);
					}
				}
			} while (dadosAluno != null);
		} catch (Exception ex) {
			System.out.println("Deu algum ruim");
			ex.printStackTrace();
		}
	}

}
