package n1exercici1;

public class InstrumentVent extends Instrument {
	
	public InstrumentVent(String nom, float preu) {
		super(nom, preu);
	}
	
	@Override
	public String tocar() {
		return "Està sonant un instrument de vent.";
	}
	
	@Override
	public String toString() {
		return "Aquest és un instrument de vent amb el nom " + super.getNom() + 
				" i amb un preu de " + super.getPreu() + " euros.";
	}

}
