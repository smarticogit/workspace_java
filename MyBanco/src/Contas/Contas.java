package Contas;

public class Contas {
	private String titular;
	private int id;
	private double saldo;
	
	public void exibirDados() {
		System.out.println("ID: "+id+" | Titular: "+titular);
		System.out.printf("Saldo: %.2f",saldo);
		System.out.println("");
	}
	
	public void comprar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente\n");
		}
		else {
			saldo -= valor;
			System.out.println("Seu saldo atual é : "+saldo+"\n");
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}

