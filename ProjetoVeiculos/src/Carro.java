
public class Carro extends Veiculo{
	private int     numPortas;
	private boolean temOpcionais;
	
	public Carro(String marca, String modelo, int ano, int numPortas, boolean temOpcionais) {
		super(marca, modelo, ano);
		this.numPortas = numPortas;
		this.temOpcionais = temOpcionais;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro "+super.marca+" Acelera no p� VRUUUUMMMMMM");
		
	}

	@Override
	public void frear() {
		System.out.println("Carro "+super.marca+ " Freia na m�o! IIIIICCCCCHHHHH!!!");
	}
	
	

}
