package br.com.danidev.salarios.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.danidev.salarios.classes.Chefe;
import br.com.danidev.salarios.classes.Funcionario;
import br.com.danidev.salarios.classes.Horista;

public class Main {

	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		
		lista.add(new Chefe("Daniel", 1010, 5000.00, 0.20, 100));
		lista.add(new Horista("Joao", 1011, 50.00, 10));
		lista.add(new Horista("Amadeu", 1013, 170.00, 10));
		lista.add(new Chefe("Cleber", 1012, 2000.00, 0.10, 50));
		lista.add(new Chefe("Ana", 1014, 1200.00, 0.10, 50));
		
//		for (Funcionario item: lista) {
//			System.out.println(item);
//		}
		
//		lista.stream().sorted(Comparator.comparing(Funcionario::calcularSalario)).forEach(e -> System.out.println(e));
		lista.stream().sorted(Comparator.comparing(f -> f.calcularSalario())).forEach(e -> System.out.println(e));
	}
}
