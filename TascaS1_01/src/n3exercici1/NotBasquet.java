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
		
	public String calcularPreuNoticia() {
		int preuInici = 250, preuFinal = 0;
		super.setPreu(preuInici);
		
		if(this.competicio.equalsIgnoreCase("Eurolliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			preuFinal = preuInici + 150;
		}  else if(this.competicio.equalsIgnoreCase("Eurolliga") || (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			preuFinal = preuInici + 75;
		} else {
			preuFinal = preuInici;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
	}
	
	public String calcularPuntsNoticia() {
		int puntsInici = 4, puntsFinal = 0;
		super.setPunts(puntsInici);
		
		if(this.competicio.equalsIgnoreCase("Eurolliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			puntsFinal = puntsInici + 4;
		} else if(this.competicio.equalsIgnoreCase("Eurolliga") || (this.competicio.equalsIgnoreCase("ACB") && (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")))) {
			puntsFinal = puntsInici + 3;
		} else if(this.competicio.equalsIgnoreCase("ACB")) {
			puntsFinal = puntsInici + 2;
		} else if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			puntsFinal = puntsInici + 1;
		} else {
			puntsFinal = puntsInici;
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
