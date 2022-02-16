package br.com.isidrocorp.imposto.model;

public abstract class Contribuinte {
	protected int    numeroCadastral;
	protected String nome;
	protected String endereco;
	
	public Contribuinte(int numeroCadastral, String nome, String endereco) {
		super();
		this.numeroCadastral = numeroCadastral;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public abstract double calcularImposto();
	
	public int getNumeroCadastral() {
		return numeroCadastral;
	}
	public void setNumeroCadastral(int numeroCadastral) {
		this.numeroCadastral = numeroCadastral;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void facaAlgumaCoisa() {
		System.out.println("Contribuinte independente de PF ou PJ fez algo");
	}

}
