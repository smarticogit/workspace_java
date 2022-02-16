import java.util.Scanner;

public class Uri2780 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int d;
		int pontos;
		
		d = teclado.nextInt();
		pontos = 0;
		
		if(d <= 800) {
			pontos = 1;
			System.out.println(pontos);
		}
		else if(d > 800 && d <= 1400) {
			pontos = 2;
			System.out.println(pontos);
		}
		else {
			pontos = 3;
			System.out.println(pontos);
		}
		teclado.close();
	}
}
