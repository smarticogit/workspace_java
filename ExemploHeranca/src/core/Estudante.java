package core;

// a defini��o da classe Estudante AMPLIA A defini��o da classe Pessoa
// a estrutura ESTUDANTE � uma AMPLIA��O da estrutura PESSOA
// ou seja, s� pelo cabe�alho, ESTUDANTE tem tudo o que tem em pessoa, al�m da sua peculiaridade

public class Estudante extends Pessoa {
	int numeroMatricula;
	
	public Estudante(String nome, String email, String telefone, int numMatricula) {
		super(nome, email, telefone);
		this.numeroMatricula = numMatricula;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Estudante: "+super.nome+"/"+super.email+"/"+super.telefone+"/"+this.numeroMatricula);
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	

}
