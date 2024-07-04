package n3exercici1;

public class NotBasquet extends Noticia{
	
	private String competicio;
	private String club;
	
	public NotBasquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}
		
	public String getCompeticio() {
		return this.competicio;
	}
	
	public String getClub() {
		return this.club;
	}
		
	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	
	@Override
	public String calcularPreuNoticia() {
		final int PREU_INICI = 250;
		int preuFinal = 0;
		super.setPreu(PREU_INICI);
		
		if(this.competicio.equalsIgnoreCase("Eurolliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			preuFinal = PREU_INICI + 150;
		}  else if(this.competicio.equalsIgnoreCase("Eurolliga") || (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			preuFinal = PREU_INICI + 75;
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
		
		if(this.competicio.equalsIgnoreCase("Eurolliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			puntsFinal = PUNTS_INICI + 4;
		} else if(this.competicio.equalsIgnoreCase("Eurolliga") || (this.competicio.equalsIgnoreCase("ACB") && (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")))) {
			puntsFinal = PUNTS_INICI + 3;
		} else if(this.competicio.equalsIgnoreCase("ACB")) {
			puntsFinal = PUNTS_INICI + 2;
		} else if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			puntsFinal = PUNTS_INICI + 1;
		} else {
			puntsFinal = PUNTS_INICI;
		}
		
		super.setPunts(puntsFinal);
		
		return puntsFinal + " punts.";
	}
		
	public String toString() {
		return "Notícia de bàsquet\n"
				+ "Titular: " + super.getTitular()
				+ "\nText: " + super.getText()
				+ "\nCompetició: " + this.competicio
				+ "\nClub: " + this.club
				+ "\nPuntuació: " + this.calcularPuntsNoticia()
				+ "\nPreu: " + this.calcularPreuNoticia();
		
	}

}
