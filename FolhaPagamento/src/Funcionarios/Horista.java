package Funcionarios;

public class Horista extends Funcionarios {
	private double valorHora;
	private int numeroHoras;
	
	public Horista(String nome, int numeroRegistro, double valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	@Override
	public double calcularSalario() {
		double valor = 0.0;
		valor = this.valorHora * this.numeroHoras;
		return valor;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
}
