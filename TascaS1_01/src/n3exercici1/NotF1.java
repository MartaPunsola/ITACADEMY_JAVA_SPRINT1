package n3exercici1;

public class NotF1 extends Noticia{
	
	private String escuderia;
	
	public NotF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}
		
	public String getEscuderia() {
		return this.escuderia;
	}
		
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
		
	public String calcularPreuNoticia() {
		int preuInici = 100, preuFinal = 0;
		super.setPreu(preuInici);
		
		if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			preuFinal = preuInici + 50;
		} else {
			preuFinal = preuInici;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
	}
	
	public String calcularPuntsNoticia() {
		int puntsInici = 4, puntsFinal = 0;
		super.setPunts(puntsInici);
		
		if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			puntsFinal = puntsInici + 2;
		} else {
			puntsFinal = puntsInici;
		}
		super.setPunts(puntsFinal);
		
		return puntsFinal + " punts.";
		
	}
		
	public String toString() {
		return "Notícia de futbol:\n"
				+ "Titular: " + super.getTitular()
				+ "\nText: " + super.getText()
				+ "\nCompetició: " + this.escuderia
				+ "\nPuntuació: " + this.calcularPuntsNoticia()
				+ "\nPreu: " + this.calcularPreuNoticia();
		
	}

}
