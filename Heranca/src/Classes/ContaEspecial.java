package Classes;

public class ContaEspecial extends Conta {
	double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}
	
	
	public void exibirInfo() {
		System.out.printf("Titular: %s \n CPF: %s \n Saldo: %.2f\n Limite: %.2f\n", super.nomeTitular, super.cpf, super.saldo, limite);
	}
	
	@Override
	public void debitar (double valor) {
		if (valor > limite) {
			System.out.println("Nao é possivel fazer essa operaçao");
		} else {
			saldo -= valor;
			if (saldo < 0) {
				limite = limite + saldo;				
			}
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
