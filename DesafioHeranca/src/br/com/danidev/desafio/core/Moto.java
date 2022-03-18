package br.com.danidev.desafio.core;

import br.com.danidev.desafio.taxes.BemTributavel;

public class Moto extends Veiculo implements BemTributavel {
	private double cilindradas;
	private String tipo;
	
	public Moto(String marca, String modelo, int ano, double preco, double cilindradas, String tipo) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", cilindradas="
				+ cilindradas + ", tipo=" + tipo + "]";
	}

	@Override
	public double calcularImposto() {
		double valor = 0.0;
		if (this.cilindradas > 500) {
			valor = this.preco * 0.05;
		} else {
			valor = this.preco * 0.025;
		}
		return valor;
	}
}