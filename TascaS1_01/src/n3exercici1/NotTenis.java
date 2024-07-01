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
		
	public String calcularPreuNoticia() {
		int preuInici = 150, preuFinal = 0;
		super.setPreu(preuInici);
		
		if(this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic")) {
			preuFinal = preuInici + 100;
		} else {
			preuFinal = preuInici;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
	}
	
	public String calcularPuntsNoticia() {
		int puntsInici = 4, puntsFinal = 0;
		super.setPunts(puntsInici);
		
		if(this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic")) {
			puntsFinal = puntsInici + 3;
		} else {
			puntsFinal = puntsInici;
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
