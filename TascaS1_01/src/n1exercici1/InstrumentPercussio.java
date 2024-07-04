package n1exercici1;

public class InstrumentPercussio extends Instrument {
	
	public InstrumentPercussio(String nom, float preu) {
		super(nom, preu);
	}
	
	
	@Override
	public String tocar() {
		return "Està sonant un instrument de percussió.";
	}
		
	@Override
	public String toString() {
		return "Aquest és un instrument de percussió amb el nom " + super.getNom() + 
				" i amb un preu de " + super.getPreu() + " euros.";
	}

}
