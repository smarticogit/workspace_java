package br.com.danieldev.app.contribuinte;

public class pessoaJuridica extends contribuinte{
	private String cnpj;
	private double faturamento;
	
	public pessoaJuridica(int numCadastro, String nome, String endereco, String cnpj, double faturamento) {
		super(numCadastro, nome, endereco);
		this.cnpj = cnpj;
		this.faturamento = faturamento;
	}
	
	public double calcular () {
		double valor = 0;
		if (this.faturamento < 100000) {
			valor = 0.0;
			System.out.println("Você está isento");
		}
		else if (this.faturamento < 250000) {
			valor = this.faturamento * 0.06;
		}
		else if (this.faturamento < 450000) {
			valor = this.faturamento * 0.15;
		}
		else {
			valor = this.faturamento * 0.25;
		}
		return valor;
	}


	@Override
	public String toString() {
		return "pessoaJuridica [numCadastro=" + numCadastro + ", nome=" + nome + ", endereco=" + endereco + ", cnpj="
				+ cnpj + ", faturamento=" + faturamento + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
}
