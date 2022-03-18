package br.com.danidev.aluraio.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LeituraCSV {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner leitor = new Scanner(new File("contas.csv"), "UTF-8");
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			
			Scanner linhaTratada = new Scanner(linha);
			//linhaTratada.useLocale(Locale.US);
			linhaTratada.useDelimiter(",");
			
			String tipo = linhaTratada.next();
			int agencia = linhaTratada.nextInt();
			int conta = linhaTratada.nextInt();
			String titular = linhaTratada.next();
			double valor = linhaTratada.nextDouble();
			
			String formatado = String.format(new Locale("pt","BR"), "Titular: %-10s %s:%08d-%04d, saldo: R$ %.2f;", 
					titular, tipo, agencia, conta, valor );
	
			System.out.println(formatado);

			linhaTratada.close();
		}
		
		leitor.close();
	}
}
