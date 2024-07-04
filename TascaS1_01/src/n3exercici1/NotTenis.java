package n3exercici1;

public class NotTenis extends Noticia{
	
	private String competicio;
	private String tenista;
	
	public NotTenis(String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;
	}
		
	public String getCompeticio() {
		return this.competicio;
	}
	
	public String getTenista() {
		return this.tenista;
	}
		
	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}
	
	public void setTenista(String tenista) {
		this.tenista = tenista;
	}
	
	@Override
	public String calcularPreuNoticia() {
		final int PREU_INICI = 150;
		int preuFinal = 0;
		super.setPreu(PREU_INICI);
		
		if(this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic")) {
			preuFinal = PREU_INICI + 100;
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
		
		if(this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic")) {
			puntsFinal = PUNTS_INICI + 3;
		} else {
			puntsFinal = PUNTS_INICI;
		}
		super.setPunts(puntsFinal);
		
		return puntsFinal + " punts.";
	}
	
	public String toString() {
		return "Notícia de tenis:\n"
				+ "Titular: " + super.getTitular()
				+ "\nText: " + super.getText()
				+ "\nCompetició: " + this.competicio
				+ "\nClub: " + this.tenista
				+ "\nPuntuació: " + this.calcularPuntsNoticia()
				+ "\nPreu: " + this.calcularPreuNoticia();
		
	}

}
