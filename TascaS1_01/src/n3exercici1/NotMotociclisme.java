package n3exercici1;

public class NotMotociclisme extends Noticia{
	
	private String equip;
	
	public NotMotociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}
		
	public String getEquip() {
		return this.equip;
	}
		
	public void setEquip(String equip) {
		this.equip = equip;
	}
	

	@Override
	public String calcularPreuNoticia() {
		final int PREU_INICI = 100;
		int preuFinal = 0;
		super.setPreu(PREU_INICI);
		
		if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			preuFinal = PREU_INICI + 50;
		} else {
			preuFinal = PREU_INICI;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
		
	}
	
	@Override
	public String calcularPuntsNoticia() {
		final int PUNTS_INICI = 3;
		int puntsFinal = 0;
		super.setPunts(PUNTS_INICI);
		
		if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			puntsFinal = PUNTS_INICI + 3;
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
				+ "\nCompetició: " + this.equip
				+ "\nPuntuació: " + this.calcularPuntsNoticia()
				+ "\nPreu: " + this.calcularPreuNoticia();
		
	}

}
