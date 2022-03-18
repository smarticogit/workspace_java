package br.com.danidev.desafio.core;

import br.com.danidev.desafio.taxes.BemTributavel;

public class Comercial extends Imovel implements BemTributavel{
	private String uso;

	public Comercial(String endereco, double valorVenal, String uso) {
		super(endereco, valorVenal);
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	@Override
	public double calcularImposto() {
		double valor = this.valorVenal * 0.04;
		return valor;
	}
	
	
}
