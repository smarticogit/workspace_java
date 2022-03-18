import java.util.Scanner;

public class Cinema{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int idade;
		double valor = 15.0;
		
		System.out.println("Qua seu nome?");
		nome = teclado.nextLine();
		
		System.out.println("Quantos anos");
		idade = teclado.nextInt();
		
		if (idade >= 18) {
			System.out.printf("%s ,Voce pode entrar. Valor da entrada é R$%.2f",nome,valor);
		} else {
			System.out.println(nome+", Desculpe, mas voce nao pode entrar");
		}
	}
}