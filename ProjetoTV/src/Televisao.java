/* a idéia é que a classe Televisao seja apenas para armazenar as infos
 * relativas a uma TV
 */
public class Televisao {
	// aqui defino os atributos (variaveis) que compoem sua definicao
	String  marca;
	int     tamanho;
	boolean ligado;
	int     canal;
	int     volume;
	
	// criamos o método exibirTV
	void exibirTV( /*aqui vao as entradas */ ) {
		System.out.println("        \\/         ");
		System.out.println("+===================+");
		System.out.println("| "+ marca +"        |");
		System.out.println("| "+ tamanho +"         pol    |");
		System.out.println("+===================+");
		System.out.println("     |        |");
	}
	
	
	void ligar() {
		ligado = true;
		System.out.println("A TV "+marca+" agora esta ligada");
	}
	void desligar() {
		ligado = false;
		System.out.println("A TV "+marca+" foi desligada");
	}
	
	void aumentarVolume() {
		if (!ligado) {
			System.out.println("Por favor, antes ligue a TV "+marca);
		}
		else {
			volume++;
			System.out.println("Agora a TV "+marca+" esta no volume "+volume);
		}
	}
	
	void avancarCanal() {
		if(!ligado) {
			System.out.println("Para mudar de canal, ligue a TV");
		}
		else {
			canal++;
			System.out.println("Agora a TV "+marca+" esta no canal "+canal);
		}
	}
	
	void sintonizarCanal(int novoCanal) {
		if (!ligado) {
			System.out.println("Para sintonizar, ligue a TV");
		}
		else {
			if (novoCanal <= 0 || novoCanal > 999) {
				System.out.println("Erro - canal inválido");
			}
			else {
				canal = novoCanal;
				System.out.println("Agora a TV "+marca+" esta no canal "+canal);
			}
		}
	}
	
	int obterCanalSintonizado(){
		return canal;
	}
	
	
}
