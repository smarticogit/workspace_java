package br.com.danidev.desafio.core;

public class Rural extends Imovel{
	private String tipo;

	public Rural(String endereco, double valorVenal, String tipo) {
		super(endereco, valorVenal);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
