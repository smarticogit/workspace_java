package Banco;

import Classes.Conta;
import Classes.ContaEspecial;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta("Daniel", "308...", 1, 1000);
		ContaEspecial c2 = new ContaEspecial("Daniel", "308...", 2, 800, 2000);
		
		try {
			
			c1.creditar(-10);
			c2.debitar(0);
			
		} catch (ProdutoException e) {
			System.err.println("Erro: "+e.getMessage());
			System.err.println("Valor: "+e.getValorInvalido());
		}
	}
}
