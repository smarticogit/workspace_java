package Funcionarios;

public class Chefe extends Funcionarios{
	private double salarioBase;
	private double adicionalFuncao;
	private double beneficioTermo;
	
	public Chefe(String nome, int numeroRegistro, double salarioBase, double adicionalFuncao, double beneficioTermo) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTermo = beneficioTermo;
	}
	@Override
	public double calcularSalario() {
		double valor = 0.0;
		valor = this.salarioBase + this.salarioBase * this.adicionalFuncao /100 + this.beneficioTermo;
		return valor;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public double getBeneficioTermo() {
		return beneficioTermo;
	}
	public void setBeneficioTermo(double beneficioTermo) {
		this.beneficioTermo = beneficioTermo;
	}
};
