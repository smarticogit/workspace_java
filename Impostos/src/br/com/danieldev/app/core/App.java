package br.com.danieldev.app.core;

import br.com.danieldev.app.contribuinte.contribuinte;
import br.com.danieldev.app.contribuinte.pessoaFisica;
import br.com.danieldev.app.contribuinte.pessoaJuridica;

public class App {

	public static void main(String[] args) {
		contribuinte c1= new contribuinte(1,"Daniel", "Rua Fulano de tal, num.2");
		contribuinte c2= new pessoaFisica(1,"Daniel", "Rua Fulano de tal, num.2", "308..", 50000, 2);
		contribuinte c3= new pessoaJuridica(1,"Daniel", "Rua Fulano de tal, num.2", "0001/64", 251000);

		System.out.println(c1.calcular());
		System.out.println(String.format("Imposto -> R$ %.2f", c2.calcular()));
		System.out.println(String.format("Imposto -> R$ %.2f", c3.calcular()));

	}
}
