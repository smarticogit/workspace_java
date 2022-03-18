package br.com.danidev.main;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

//		System.out.println(aulas);
//		
//		for (String item : aulas) {
//			System.out.println("Aula: "+  item);
//		}
//		
//		String primeiraAula = aulas.get(0);
//		System.out.println("A primeira é: "+ primeiraAula);
//		
//		for (int i = 0; i < aulas.size(); i++) {
//			System.out.println("Aula: "+ aulas.get(i));
//		}

		aulas.forEach(aula -> {
			System.out.println("Aqui: "+aula);
		});
		aulas.add("Aprendendo Java");
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}
}
