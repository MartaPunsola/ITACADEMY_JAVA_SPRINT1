package n3exercici1;

public class NotFutbol extends Noticia{

	private String competicio;
	private String club;
	private String jugador;
	
	public NotFutbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}
	
	public String getCompeticio() {
		return this.competicio;
	}
	
	public String getClub() {
		return this.club;
	}
	
	public String getJugador() {
		return this.jugador;
	}
		
	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	
	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
		
	public String calcularPreuNoticia() {
		int preuInici = 300, preuFinal = 0;
		super.setPreu(preuInici); 
		
		if(this.competicio.equalsIgnoreCase("Lliga de Campions") && (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equals("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))) {
			preuFinal = preuInici + 250;
		} else if (this.competicio.equalsIgnoreCase("Lliga de Campions") && (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			preuFinal = preuInici + 200;
		} else if ((this.competicio.equalsIgnoreCase("Lliga de Campions") || (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equals("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			preuFinal = preuInici + 150;
		} else if(this.competicio.equalsIgnoreCase("Lliga de Campions") || this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			preuFinal = preuInici + 100;
		} else if (this.jugador.equals("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) {
			preuFinal = preuInici + 50;
		} else {
			preuFinal = preuInici;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
	}
	
	public String calcularPuntsNoticia() {
		int puntsInici = 5, puntsFinal = 0;
		super.setPunts(puntsInici);
		
		if(this.competicio.equalsIgnoreCase("Lliga de Campions") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))) {
			puntsFinal = puntsInici + 5;
		} else if((this.competicio.equalsIgnoreCase("Lliga de Campions") && ((this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) || (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) || (this.competicio.equalsIgnoreCase("Lliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			puntsFinal = puntsInici + 4;
		} else if(this.competicio.equalsIgnoreCase("Lliga de Campions") || (this.competicio.equalsIgnoreCase("Lliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) || (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			puntsFinal = puntsInici + 3;
		} else if (this.competicio.equalsIgnoreCase("Lliga") || ((this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			puntsFinal = puntsInici + 2;
		} else if((this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) || (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))) {
			puntsFinal = puntsInici + 1;
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
				+ "\nCompetició: " + this.competicio
				+ "\nClub: " + this.club
				+ "\nJugador: " + this.jugador
				+ "\nPuntuació: " + this.calcularPuntsNoticia()
				+ "\nPreu: " + this.calcularPreuNoticia();
		
	}

}
