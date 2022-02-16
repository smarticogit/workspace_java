package objects;

public class Heroi extends GameObject {
	private int modo;

	public Heroi(String filename, int x, int y, int modo) {
		super(filename, x, y);
		this.modo = modo;
	}

	@Override
	public void update() {
		this.x = this.x + 5*modo;
		if (this.x > 480 || this.x <= 0) {
			this.modo = this.modo * -1;
		}
	}
	
	
}
