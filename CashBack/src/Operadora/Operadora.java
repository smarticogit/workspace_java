package Operadora;

import Cartoes.Cartao;
import Cartoes.CartaoCashBack;

public class Operadora {

	public static void main(String[] args) {
		Cartao c1 = new Cartao("29051", "Daniel", 2028, 10, 500.00);
		Cartao c2 = new CartaoCashBack("29051", "Daniel", 2028, 10, 500.00, 3);
		
		c1.comprar(100);
		c2.comprar(100);
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
