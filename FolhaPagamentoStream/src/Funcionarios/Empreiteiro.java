package Funcionarios;

public class Empreiteiro extends Funcionarios {
	private double valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, double valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	@Override
	public double calcularSalario () {
		double valor = this.valorEmpreita;
		return valor;
	}

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
}
