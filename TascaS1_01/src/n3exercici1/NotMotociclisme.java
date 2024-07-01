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
	

	public String calcularPreuNoticia() {
		int preuInici = 100, preuFinal = 0;
		super.setPreu(preuInici);
		
		if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			preuFinal = preuInici + 50;
		} else {
			preuFinal = preuInici;
		}
		super.setPreu(preuFinal);
		
		return preuFinal + " euros.";
		
	}
	
	public String calcularPuntsNoticia() {
		int puntsInici = 3, puntsFinal = 0;
		super.setPunts(puntsInici);
		
		if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			puntsFinal = puntsInici + 3;
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
				+ "\nCompetició: " + this.equip
				+ "\nPuntuació: " + this.calcularPuntsNoticia()
				+ "\nPreu: " + this.calcularPreuNoticia();
		
	}

}
