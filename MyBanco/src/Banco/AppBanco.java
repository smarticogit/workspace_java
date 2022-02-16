package Banco;

import Contas.Contas;

public class AppBanco {

	public static void main(String[] args) {
		
		Contas c1 = new Contas();
		
		c1.setTitular("Daniel");
		c1.setId(1);
		c1.setSaldo(500);
		
		c1.exibirDados();
		c1.comprar(200);
		c1.comprar(400);
	}
}
