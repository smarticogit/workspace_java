
public class Main {
	public static void main(String[] args) {
		
		
		int[] idades = new int[5];
		
		idades[0] = 29;
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i + i * i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}
}
