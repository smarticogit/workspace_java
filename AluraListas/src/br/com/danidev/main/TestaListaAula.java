package br.com.danidev.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Lista de Objetos", 15);
		Aula a2= new Aula("Relacionamentos de listas e objetos", 10);
		Aula a3 = new Aula("ArrayList", 21);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);

		System.out.println(aulas);
		
//		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}
}
