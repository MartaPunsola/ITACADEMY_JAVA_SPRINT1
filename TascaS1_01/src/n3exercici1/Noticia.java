package n3exercici1;

public abstract class Noticia {
	
	private String titular;
	private String text;
	private int punts;
	private int preu;
	
	public Noticia(String titular) {
		this.titular = titular;
		this.text = "";
		this.punts = 0;
		this.preu = 0;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public String getText() {
		return this.text;
	}
	
	public int getPunts() {
		return this.punts;
	}
	
	public int getPreu() {
		return this.preu;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setPunts(int punts) {
		this.punts = punts;
	}
	
	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	public abstract String calcularPreuNoticia();
	
	public abstract String calcularPuntsNoticia();
	
	

}
