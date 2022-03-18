package br.com.danidev.desafio.core;

import br.com.danidev.desafio.taxes.BemTributavel;

public class Carro extends Veiculo implements BemTributavel{
	private int numPortas;
	private double potencia;

	public Carro(String marca, String modelo, int ano, double preco, int numPortas, double potencia) {
		super(marca, modelo, ano, preco);
		this.numPortas = numPortas;
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", numPortas="
				+ numPortas + ", potencia=" + potencia + "]";
	}

	@Override
	public double calcularImposto() {
		double valor = 0.0;
		if(this.ano >= 2000) {
			valor = super.preco * 0.08;
		} else {
			valor = 0.0;
		}
		return valor;
	}
	
}
