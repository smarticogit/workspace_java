import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Daniel", 29052, 1743);
		Conta c2 = new Conta("Joao", 29052, 1743);
		Conta c3 = new Conta("Carlos", 29052, 1743);
		
//		ArrayList lista = new ArrayList();
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
//		for (Object item : lista) {
//			System.out.println(item);
//		}
		
		for (Conta item : lista) {
			System.out.println(item);
		}
		
	}
}
