
// a id�ia � que eu tenha apenas um "template" m�nimo de uma estrutura, ou seja
// qualquer ve�culo deve ter estas informa��es 
// al�m do template, eu consigo definir "obriga��es" para os filhos implementarem
// ou seja: na classe abstrata eu defino O QUE... os filhos definem COMO
public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected int    ano;
	
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	// apenas as classes abstratas podem definir m�todos que OBRIGATORIAMENTE devem ser
	// implementados nas classes filhas
	public abstract void acelerar();
	public abstract void frear();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
