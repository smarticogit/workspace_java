package Bomba;

public class Bomba {
	private String tipoCombustivel;
	private float litros;
	private float valor;
	private float total;
	
	public Bomba(String tipoCombustivel, float litros, float valor, float total) {
		super();
		this.tipoCombustivel = tipoCombustivel;
		this.litros = litros;
		this.valor = valor;
		this.total = total;
	}

	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public float getLitros() {
		return litros;
	}
	public void setLitros(float litros) {
		this.litros = litros;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
