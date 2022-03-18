package br.com.isidrocorp.acme.root;

/**
 * Classe funcionario que � a raiz de todas as classes. � uma classe abstrata que nos permite
 * criar toda a hireraquia polimorfica de fucionarios
 * 
 * @version 1.0
 * @author isidro
 *
 */
public abstract class Funcionario {
	protected int numeroFuncional;
	protected String nome;
	
	/**
	 * Construtor padr�o da classe
	 * @param numeroFuncional - o numero de registro do funcionario
	 * @param nome - seu nome at� 100 caracteres
	 */
	public Funcionario(int numeroFuncional, String nome) {
		super();
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
	}

	/**
	 * Classe da regra de neg�cio que precisa ser implementada nas subclasses
	 * @return o valor do sal�rio a ser calculado
	 */
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
