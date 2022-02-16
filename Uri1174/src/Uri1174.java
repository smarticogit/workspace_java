import java.util.Scanner;

public class Uri1174 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		double vetorA[] = new double [100];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = teclado.nextDouble();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] <= 10) {
				System.out.println( "A["+i+"] = "+vetorA[i]);
			}
		}
		
		teclado.close();
	}
}