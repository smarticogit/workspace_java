package br.com.isidrocorp.acme.root;

public abstract class Funcionario {
	protected int numeroFuncional;
	protected String nome;
	
	public Funcionario(int numeroFuncional, String nome) {
		super();
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
	}

	public abstract double calcularSalario();
	
	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
