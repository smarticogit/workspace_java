
public class Main {
	public static void main(String[] args) {
		MinhaThread t1, t2, t3;

		t1 = new MinhaThread(1, 1000);
		t2 = new MinhaThread(2, 1300);
		t3 = new MinhaThread(3, 1800);

		// o momento em que a thread � disparada
		t1.start();
		t2.start();
		t3.start();

		// aqui vou aguardar a conclus�o de todas as Threads para s� a� ir para a �ltima mensagem
		try {			
			t1.join();
			t2.join();
//			t3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Classe Principal finalizou");
	}
}
