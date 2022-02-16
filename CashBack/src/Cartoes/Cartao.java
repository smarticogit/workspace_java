package Cartoes;

public class Cartao {
	protected String numeroCartao;
	protected String titular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public Cartao(String numeroCartao, String titular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.titular = titular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	
	public boolean comprar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void adicionarCredito(double valor) {
		this.saldo = valor;
	}

	public String toString () {
		return "Titular: "+titular+" Saldo: "+String.format("%.2f", saldo);
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	
	
}
