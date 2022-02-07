
public class AppQueUsaTV {
	public static void main(String[] args) {
		Televisao t1, t2;
		
		// como estou tratando de classes, eu preciso, declarar E INSTANCIAR
		t1 = new Televisao();  // solicito à MV Java, a quantidade de memória necessária para acomodar esta estrutura na memória
		t2 = new Televisao();
		
		t1.marca   = "Telefunken";
		t1.tamanho = 20;
		t1.ligado  = false;
		t1.canal   = 5;
		t1.volume  = 0;
		
		t2.marca   = "Filipis   ";
		t2.tamanho = 55;
		t2.ligado  = true;
		t2.canal   = 10;
		t2.volume  = 3;
		
		t1.ligar();
		t1.aumentarVolume();
		t1.exibirTV();  // invocamos o método na classe principal
		
		t1.aumentarVolume();
		t1.sintonizarCanal(32);
		t1.desligar();
		
		System.out.println("A TV foi desligada no canal "+t1.obterCanalSintonizado());
	
	}

}
