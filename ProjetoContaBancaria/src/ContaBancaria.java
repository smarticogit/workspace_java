
public class ContaBancaria {
	String nomeTitular;
	String cpf;
	int    numeroConta;
	int    tipo;
	double saldo;
	
	// pensar nos métodos
	void exibirInfo() {
		System.out.println("Conta Bancaria: "+numeroConta + 
				   ((tipo==0)?" - Conta Corrente":
					          ((tipo==1)?" - Poupança":" - Investimentos")));
		System.out.println("Titular: "+nomeTitular+" ("+cpf+")");
		System.out.printf("R$ %.2f\n",saldo);
	}
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;		
	}
}
