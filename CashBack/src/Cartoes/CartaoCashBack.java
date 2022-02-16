package Cartoes;

public class CartaoCashBack extends Cartao{
	private int nivel;
	
	public CartaoCashBack(String numeroCartao, String titular, int anoValidade, int mesValidade, double saldo, int nivel) {
		super(numeroCartao, titular, anoValidade, mesValidade, saldo);
		this.nivel = nivel;
	}
	
	public String toString () {
		return "Titular: "+titular+" Saldo: "+String.format("%.2f", saldo);
	}

	@Override
	public boolean comprar(double valor) {
		if (super.comprar(valor)) {
			if (nivel == 1) {
				super.saldo += valor * (2.0 / 100);
				return true;
			}
			else if(nivel == 2) {
				super.saldo += valor * (5.0 / 100);
				return true;
			}
			else if(nivel == 3) {
				super.saldo += valor * (8.0 / 100);
				return true;
			}
		}
		return false;
	}
}
