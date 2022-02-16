package scene;

import javax.swing.JFrame;

import objects.GameObject;
import objects.Heroi;

public class Fase extends JFrame implements Runnable {
	private GameObject objetos[];
	
	public Fase() {
		setTitle("Meu Peceudo Jogo");		
		setBounds(0, 0, 640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		objetos = new GameObject[1];
		objetos[0] = new Heroi("C:\\users\\isidro\\Desktop\\worspace_ifood\\ProjetoPseudoJogo\\mario.png", 50, 50,1);
		
		getContentPane().add(objetos[0].getImagem());
		
		Thread t= new Thread(this);
		t.start();
		
		
	}
	
	public void update() {
		
	}
	
	public void draw() {
		getContentPane().removeAll();
		for(GameObject g: objetos) {
			g.draw();
			getContentPane().add(g.getImagem());
		}
		repaint();
		
	}

	@Override
	public void run() {

		// fará o loop do jogo
		while (true) {
			try {
				Thread.sleep(50);
				update();
				draw();
			}
			catch(InterruptedException ex) {
				System.err.println("erro ao atualizar o jogo");
			}
		}
		
	}

	
	
}
