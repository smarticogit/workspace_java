package br.com.danieldev.app.contribuinte;

public class contribuinte {
	protected int numCadastro;
	protected String nome;
	protected String endereco;
	
	public contribuinte(int numCadastro, String nome, String endereco) {
		this.numCadastro = numCadastro;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public double calcular() {
		System.out.println("Olá "+this.nome+" No seu caso não precisa!!");
		double valor = 0.0;
		return valor;
	}

	public String toString() {
		return "Olá "+nome+"";
	}
}
