package br.com.danidev.salarios.classes;

public class Horista extends Funcionario {
	private double valorHora;
	private int horas;
	
	public Horista(String nome, int registro, double valorHora, int horas) {
		super(nome, registro);
		this.valorHora = valorHora;
		this.horas = horas;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorHora * this.horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public int getHoras() {
		return horas;
	}

	@Override
	public String toString() {
		return String.format("Horista: %s reg: %06d valorHora: %.2f horas: %d salario: %.2f",nome, registro, valorHora, horas, this.calcularSalario());
	}
}
