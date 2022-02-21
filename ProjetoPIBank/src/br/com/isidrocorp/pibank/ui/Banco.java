package br.com.isidrocorp.pibank.ui;

import br.com.isidrocorp.pibank.core.Conta;
import br.com.isidrocorp.pibank.core.ContaEspecial;
import br.com.isidrocorp.pibank.core.ContaPremium;
import br.com.isidrocorp.pibank.core.exceptions.ContaException;

public class Banco {
	public static void main(String[] args) {
		Conta c1;
		Conta c2;
		Conta c3;
		try {
			c1 = new Conta("Professor Isidro", "98765430", 12345, 100.0);
			c2 = new ContaEspecial("Bianca Padilha", "1235874", 98754, 100, 200);
			c3 = new ContaPremium("Pam Lima", "5848697", 65484, 100, 250, 0.0);
			c1.creditar(-20);
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);

			c1.debitar(-150);
			c2.debitar(150);
			c3.debitar(300);

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);

			if (c3 instanceof ContaPremium) {
				System.out.println("C3 � premium");
				ContaPremium tmp2 = (ContaPremium) c3;
				System.out.println("Suas milhas valem " + tmp2.getMilhas());

			} else if (c3 instanceof ContaEspecial) {
				System.out.println("C3 � especial");
				ContaEspecial tmp = (ContaEspecial) c3;
				System.out.println("Seu limite vale " + tmp.getLimite());
			} else {
				System.out.println("C3 � gen�rico");
			}
//		c2.debitar(150);
//		System.out.println(c2);
//		
//		c2.debitar(1);
//		System.out.println(c2);

		} catch (ContaException ex) {
			System.err.println("Erro na opera��o: " + ex.getMessage());
			System.err.println("Valor utilizado: R$ "+ex.getValorInvalido());
		}

	}

}
