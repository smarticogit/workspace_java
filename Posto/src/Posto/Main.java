package Posto;

import java.util.Scanner;

import Bomba.Bomba;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Bomba b1 = new Bomba("Gasolina", 0.0f, 0.0f, 0.0f);
		String tipo = "";
		float preco = 0.0f;
		
		System.out.println("Olá, qual tipo de combustível vai ser?");
		System.out.println("1 - Gasolina R$ 2,00");
		System.out.println("2 - Etanol R$ 1,50");
		System.out.println("3 - Diesel R$ 2,50");
	
		int opcao = teclado.nextInt();
		switch(opcao) {
		case 1:
			tipo = "Gasolina";
			preco = 2.0f;
			break;
		case 2:
			tipo = "Etanol";
			preco = 1.5f;
			break;
		case 3:
			tipo = "Diesel";
			preco = 2.5f;
			break;
		}
		
		System.out.println("Litros ou Valor");
		System.out.println("1 - Litros");
		System.out.println("2 - Valor");
		
		opcao = teclado.nextInt();
		
		System.out.println("Qual valor?");
		
		float valor = teclado.nextFloat();
		
		switch(opcao) {
		case 1:
			break;
		case 2:
			b1.setTipoCombustivel("Valor");
			break;
		}
		
		teclado.close();
	}

}
