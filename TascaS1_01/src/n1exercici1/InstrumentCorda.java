package n1exercici1;

public class InstrumentCorda extends Instrument {
	
	
	public InstrumentCorda(String nom, float preu) {
		super(nom, preu);
	}
		
	
	public String tocar() {
		return "Està sonant un instrument de corda.";
	}
		
	
	public String toString() {
		return "Aquest és un instrument de corda amb el nom " + super.getNom() + 
				" i amb un preu de " + super.getPreu() + " euros.";
	}

}
