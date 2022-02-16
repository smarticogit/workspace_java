package Cadastro;

public class Pessoas {
	private String nome;
	private int idade;
	private double altura;
	private String email;
	private double salario;
	
//	public Pessoas (String nome, int idade, double altura, String email, double salario) {
//		this.nome = nome;
//		this.idade = idade;
//		this.altura = altura;
//		this.email = email;
//		this.salario = salario;
//	}
//	
//	public Pessoas (String nome, String email) {
//		this.nome = nome;
//		this.email = email;
//	}
	
	
	public void exibirDados() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(email);
		System.out.println(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
