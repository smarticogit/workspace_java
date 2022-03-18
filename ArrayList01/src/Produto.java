
public class Produto {
	private int id;
	private String nomeProduto;
	private double valorProduto;
	private int estoque;
	
	public Produto(int id, String nomeProduto, double valorProduto, int estoque) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto id: " + id + ", Nome: " + nomeProduto + ", Valor: " + valorProduto + ", Estoque: "
				+ estoque + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
