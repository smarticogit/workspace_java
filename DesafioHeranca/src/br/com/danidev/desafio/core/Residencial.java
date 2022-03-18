package br.com.danidev.desafio.core;

import br.com.danidev.desafio.taxes.BemTributavel;

public class Residencial extends Imovel implements BemTributavel{
	private double metragem;
	
	public Residencial(String endereco, double valorVenal) {
		super(endereco, valorVenal);
		
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	@Override
	public double calcularImposto() {
		double valor = 0.0;
		if (this.metragem > 100) {
			valor = this.valorVenal * 0.03;
		} 
		else {
			valor = this.valorVenal * 0.015;
		}
		return valor;
	}
}
