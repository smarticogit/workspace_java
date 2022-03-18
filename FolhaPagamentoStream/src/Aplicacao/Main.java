package Aplicacao;

import Funcionarios.*;

public class Main {
	public static void main(String args[]) {
		
		Funcionarios lista[] = new Funcionarios[4];
		
		lista[0] = new Chefe ("Daniel", 1001, 10000, 10, 100);
		lista[1] = new Comissionado ("Joao", 1002, 5000, 10);
		lista[2] = new Horista ("Claudio", 1003, 20.0, 10);
		lista[3] = new Empreiteiro ("Ana", 1004, 20000);
		
		for (Funcionarios x: lista) {
			System.out.println("Funcionário: "+x.getNome()+" -  Valor a receber: R$ "+String.format("%.2f", x.calcularSalario())); 			
		}
	}
}
