package Franklin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Entre com um texto:");
		String texto = input.nextLine();

		texto = texto.replaceAll(",", "").replaceAll("\\.", "").replaceAll("\\!", "").replaceAll("\\?", "");

		String palavras[] = texto.split(" ");

		System.out.println(texto);
		Map<String, Integer> mapPalavras = new HashMap<String, Integer>();

		for (String p : palavras) {
			p = p.toLowerCase();
			if (!mapPalavras.containsKey(p)) {
				mapPalavras.put(p, 1);
			} else {
				mapPalavras.put(p, mapPalavras.get(p) + 1);
			}
		}

		System.out.println("Contando palavras");
		for (Map.Entry<String, Integer> s : mapPalavras.entrySet()) {
			System.out.println(s.getKey() + ": " + s.getValue());
		}

		input.close();
	}

}