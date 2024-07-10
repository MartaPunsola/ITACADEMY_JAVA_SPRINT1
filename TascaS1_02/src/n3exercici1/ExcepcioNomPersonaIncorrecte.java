package n3exercici1;

public class ExcepcioNomPersonaIncorrecte extends Exception {
	
	public ExcepcioNomPersonaIncorrecte() {}
	
	public ExcepcioNomPersonaIncorrecte(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "El nom no pot contenir xifres.";
	}

}
