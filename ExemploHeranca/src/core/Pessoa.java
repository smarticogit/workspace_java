package core;

/* Toda classe, queiramos ou n�o, possui Object como sua superclasse
 * A Declara��o public class Pessoa � uma forma "condensada/resumida" de se explicitar o seguinte
 * public class Pessoa extends Object
 * Dessa forma, Object possui um construtor (sem par�metros). Este construtor � invocado
 * pelo construtor da classe que criamos atrav�s da 1a linha, chamando super()
 * (no fundo � o construtor da classe pai) 
 */


public class Pessoa extends Object {
	protected String nome;
	protected String email;
	protected String telefone;
	
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void mostrar() {
		System.out.println("Pessoa: "+this.nome+"/"+this.email+"/"+this.telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
