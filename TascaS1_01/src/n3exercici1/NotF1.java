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
	
	@Override
	public String calcularPreuNoticia() {
		final int PREU_INICI = 100;
		int preuFinal = 0;
		super.setPreu(PREU_INICI);
		
		if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			preuFinal = PREU_INICI + 50;
		} else {
			preuFinal = PREU_INICI;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
	}
	
	@Override
	public String calcularPuntsNoticia() {
		final int PUNTS_INICI = 4;
		int puntsFinal = 0;
		super.setPunts(PUNTS_INICI);
		
		if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			puntsFinal = PUNTS_INICI + 2;
		} else {
			puntsFinal = PUNTS_INICI;
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
