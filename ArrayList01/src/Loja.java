import java.util.ArrayList;

public class Loja {

	public static void main(String[] args) {
		
		ArrayList<Produto> lista;
		lista = new ArrayList <Produto>();
		
		lista.add(new Produto(1, "Produto1", 100, 2));
		lista.add(new Produto(2, "Produto2", 200, 5));
		lista.add(new Produto(3, "Produto3", 300, 4));
		lista.add(new Produto(4, "Produto4", 300, 10));
		lista.add(new Produto(5, "Produto5", 400, 3));
		
		
		Produto maisCaro, maisBarato;
		double totalEstoque = 0;
		int qtdItens = 0;
		
		maisCaro = maisBarato = lista.get(0);
		
		for (Produto item : lista) {
			if (item.getValorProduto() > maisCaro.getValorProduto()) {
				maisCaro = item;
			}
			if (item.getValorProduto() < maisBarato.getValorProduto()) {
				maisBarato = item;
			}
			
			totalEstoque += item.getValorProduto() * item.getEstoque();
			qtdItens += item.getEstoque();
		}
		System.out.println("Produto Mais Caro: "+maisCaro);
		System.out.println("Produto Mais Barato: "+maisBarato);
		System.out.printf("Valor do Estoque: R$ %.2f\n",totalEstoque);
		System.out.println("Total itens do estoque: "+qtdItens);
	}

}
