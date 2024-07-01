package n1exercici1;

public class InstrumentVent extends Instrument {
	
	public InstrumentVent(String nom, float preu) {
		super(nom, preu);
	}
	
	
	public String tocar() {
		return "Està sonant un instrument de vent.";
	}
	
	
	public String toString() {
		return "Aquest és un instrument de vent amb el nom " + super.getNom() + 
				" i amb un preu de " + super.getPreu() + " euros.";
	}

}
