import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria conta;
		conta = new ContaBancaria();
//		conta.nomeTitular = "Professor Isidro ";
		conta.setNomeTitular("Professro Isidro");
		conta.setCpf("987.654.321-00");
		conta.setTipo(2);
		conta.setNumeroConta(123456);
		conta.setSaldo(1000.00);
		
		do {
			System.out.println("IsiBank - Seu banco na Internerdica!!!");
			System.out.println("1-Deposito/2-Saque/3-Info/0-Encerra");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor do deposito");
				valor = teclado.nextDouble();
				conta.depositar(valor);
				break;
			case 2:				
				System.out.println("Digite o valor do saque");
				valor = teclado.nextDouble();
				if (conta.sacar(valor)) {
					System.out.println("Saque Efetuado com sucesso!");
				}
				else {
					System.out.println("Saldo Insuficiente");
				}
				break;
			case 3:
				System.out.println(conta.exibirInfo());
				break;
			case 0:
				System.out.println("obrigado pela preferencia");
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
			
		} while (opcao != 0);
		
		
		
		teclado.close();
	}
}
