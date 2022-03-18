package br.com.danidev.salarios.classes;

public abstract class Funcionario {
	
	protected String nome;
	protected int registro;
	
	public Funcionario(String nome, int registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	public abstract double calcularSalario();

	public String getNome() {
		return nome;
	}

	public int getRegistro() {
		return registro;
	}

	@Override
	public String toString() {
		return "Funcionario " + nome + ", registro=" + registro;
	}
}
