package Banco;

import Classes.Conta;
import Classes.ContaEspecial;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta("Daniel", "308...", 1, 1000);
		ContaEspecial c2 = new ContaEspecial("Daniel", "308...", 2, 800, 2000);
		
		c1.exibirInfo();
		c2.exibirInfo();
		c2.debitar(1200);
		c2.exibirInfo();

	}
}
