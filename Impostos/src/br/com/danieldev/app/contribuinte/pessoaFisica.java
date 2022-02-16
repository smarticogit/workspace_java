package br.com.danieldev.app.contribuinte;

public class pessoaFisica extends contribuinte {
	private String cpf;
	private double rendimentoAnual;
	private int dependentes;
	
	public pessoaFisica(int numCadastro, String nome, String endereco, String cpf, double rendimentoAnual,
			int dependentes) {
		super(numCadastro, nome, endereco);
		this.cpf = cpf;
		this.rendimentoAnual = rendimentoAnual;
		this.dependentes = dependentes;
	}
	
	public double calcular () {
		double valor = 0.0;
		
		if (this.dependentes > 0) {
			int temp = dependentes * 1770;
			this.rendimentoAnual -= temp;
		}
		if (this.rendimentoAnual < 25000) {
			System.out.println("Pode comemorar, você é isento!!!");
			valor = 0.0;
		}
		else if (this.rendimentoAnual < 50000) {
			valor = this.rendimentoAnual * 0.15;
		}
	
		else if (this.rendimentoAnual < 100000) {
			valor = this.rendimentoAnual * 0.20;
		}
		else {
			valor = this.rendimentoAnual * 0.275;
		}
		return valor;
	}

	@Override
	public String toString() {
		return "Pessoa Fisica [numCadastro=" + numCadastro + ", nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf
				+ ", rendimentoAnual=" + rendimentoAnual + ", dependentes=" + dependentes + "]";
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
}
