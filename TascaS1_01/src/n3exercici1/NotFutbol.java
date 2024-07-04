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
	
	@Override
	public String calcularPreuNoticia() {
		final int PREU_INICI = 300;
		int preuFinal = 0;
		super.setPreu(PREU_INICI); 
		
		if(this.competicio.equalsIgnoreCase("Lliga de Campions") && (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equals("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))) {
			preuFinal = PREU_INICI + 250;
		} else if (this.competicio.equalsIgnoreCase("Lliga de Campions") && (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid"))) {
			preuFinal = PREU_INICI + 200;
		} else if ((this.competicio.equalsIgnoreCase("Lliga de Campions") || (this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equals("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			preuFinal = PREU_INICI + 150;
		} else if(this.competicio.equalsIgnoreCase("Lliga de Campions") || this.club.equals("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			preuFinal = PREU_INICI + 100;
		} else if (this.jugador.equals("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) {
			preuFinal = PREU_INICI + 50;
		} else {
			preuFinal = PREU_INICI;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
	}
	
	@Override
	public String calcularPuntsNoticia() {
		final int PUNTS_INICI = 5;
		int puntsFinal = 0;
		super.setPunts(PUNTS_INICI);
		
		if(this.competicio.equalsIgnoreCase("Lliga de Campions") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))) {
			puntsFinal = PUNTS_INICI + 5;
		} else if((this.competicio.equalsIgnoreCase("Lliga de Campions") && ((this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) || (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) || (this.competicio.equalsIgnoreCase("Lliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			puntsFinal = PUNTS_INICI + 4;
		} else if(this.competicio.equalsIgnoreCase("Lliga de Campions") || (this.competicio.equalsIgnoreCase("Lliga") && (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) || (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			puntsFinal = PUNTS_INICI + 3;
		} else if (this.competicio.equalsIgnoreCase("Lliga") || ((this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) && (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")))) {
			puntsFinal = PUNTS_INICI + 2;
		} else if((this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) || (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))) {
			puntsFinal = PUNTS_INICI + 1;
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
				+ "\nCompetició: " + this.competicio
				+ "\nClub: " + this.club
				+ "\nJugador: " + this.jugador
				+ "\nPuntuació: " + this.calcularPuntsNoticia()
				+ "\nPreu: " + this.calcularPreuNoticia();
		
	}

}
