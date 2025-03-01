package Funcionarios;

public class Comissionado extends Funcionarios{
	private double salarioBase;
	private double comissao;
	
	public Comissionado(String nome, int numeroRegistro, double salarioBase, double comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	@Override
	public double calcularSalario () {
		double valor = 0.0;
		valor = this.salarioBase + this.salarioBase * this.comissao / 100;
		return valor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
};
