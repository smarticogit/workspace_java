public class Pessoa {
	
	String nomeDaPessoa;
	int idade;
	String endereco;
	String CPF;
	
	public Pessoa(String nomeDaPessoa, int idade, String endereco, String CPF ) {
		
		this.nomeDaPessoa = nomeDaPessoa;
		this.idade = idade;
		this.endereco = endereco;
		this.CPF = CPF;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+this.nomeDaPessoa+ " "
				+ "Idade: "+this.idade+" Endereco: "+this.endereco);
	}
}
