package Banco;
	
public class ProdutoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	double valorInvalido;

	public ProdutoException(String mensagem, double valorInvalido) {
		
		super(mensagem);
		this.valorInvalido = valorInvalido;
	}

	public double getValorInvalido() {
		return valorInvalido;
	}

	public void setValorInvalido(double valorInvalido) {
		this.valorInvalido = valorInvalido;
	}
}
