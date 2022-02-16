import java.util.Scanner;

public class Uri1159{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int x = teclado.nextInt();
		
		do {
			if (x == 0) {
				break;
			}
			
			int soma = x;
			
			if(x % 2 != 0) {
				x++;
				soma++;
			}
			for(int i = 1 ; i < 5 ; i++ ) {
				soma += 2;
				x += soma;
			}
			System.out.println(x);
			soma = 0;
			x = teclado.nextInt();

		} while (x != 0);
		
		teclado.close();
	}
}