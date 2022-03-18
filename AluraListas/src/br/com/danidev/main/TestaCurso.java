package br.com.danidev.main;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Colecoes", 15));
		
		System.out.println(javaColecoes.getAulas());
	}

}
