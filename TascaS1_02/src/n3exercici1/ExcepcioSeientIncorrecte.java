package n3exercici1;

public class ExcepcioSeientIncorrecte extends Exception {
	
	public ExcepcioSeientIncorrecte() {}
	
	public ExcepcioSeientIncorrecte(String message) {
		super(message);
	}
	
	public String getMessage() {
		return "Aquest seient no existeix.";
	}

}
