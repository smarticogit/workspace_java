import java.util.Scanner;

public class MotocasRaylon {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int entregas;
		
		System.out.println("Digite a quantidade de entregas");
		entregas = teclado.nextInt();
	
		if (entregas >= 300) {
			System.out.println("Ganhou  R$500,00");
		} else if (entregas >= 200 ) {
			System.out.println("Ganhou  R$300,00");
		} else if (entregas >= 100) {
			System.out.println("Ganhou  R$100,00");
		} else {
			System.out.println("Vai trabalhar vagabundo!");			
		}
	}
}
