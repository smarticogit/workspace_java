
public class Conta {
	String titular;
	int numeroConta;
	int agencia;
	
	public Conta(String titular, int numeroConta, int agencia) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Conta Titular: " + titular + ", NumeroConta: " + numeroConta + ", Agencia: " + agencia + "]";
	}
	
	
	

}
