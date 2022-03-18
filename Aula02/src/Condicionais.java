
public class Condicionais {

	public static void main(String[] args) {
		int idade = 17;
		boolean acompanhado = false;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Permitido");
		} else {
			System.out.println("Proibido");
		}
	}
}
