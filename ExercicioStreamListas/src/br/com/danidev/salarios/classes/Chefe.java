package br.com.danidev.salarios.classes;

public class Chefe extends Funcionario {
	private double salario;
	private double adicional;
	private double beneficio;
	
	public Chefe(String nome, int registro, double salario, double adicional, double beneficio) {
		super(nome, registro);
		this.salario = salario;
		this.adicional = adicional;
		this.beneficio = beneficio;
	}

	@Override
	public double calcularSalario() {
		return this.salario + this.adicional * this.salario + this.beneficio;
		
	}

	public double getSalario() {
		return salario;
	}

	public double getAdicional() {
		return adicional;
	}

	public double getBeneficio() {
		return beneficio;
	}

	@Override
	public String toString() {
		return String.format("Chefe: %s reg: %08d adicional: %.2f beneficio: %.2f salario: R$ %.2f", nome, registro, adicional, beneficio, calcularSalario());
	}
	
	
}
