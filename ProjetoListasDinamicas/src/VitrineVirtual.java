import java.util.ArrayList;

public class VitrineVirtual {
	public static void main(String[] args) {

		
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();

		// como eu faço para adicionar novos produtos?
		lista.add(new Produto(1, "Produto 01", 100));
		lista.add(new Produto(2, "Produto 02", 200));
		lista.add(new Produto(3, "Produto 03", 300));
		lista.add(new Produto(4, "Produto 04", 400));

		
		System.out.println(lista.get(2)); // equivale a lista[2]
		System.out.println("Lista antes da remoçao");
		System.out.println(lista);
		lista.remove(2);
		
		System.out.println("Lista depois da remoçao");
		System.out.println(lista);
		System.out.println(lista.get(2));
		
		lista.add(0, new Produto(0, "Produto Novo",0));
		
		System.out.println(lista);
		
	}

}
