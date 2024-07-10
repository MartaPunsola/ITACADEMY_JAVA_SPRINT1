package n3exercici1;

public class ExcepcioButacaLliure extends Exception {
	
	public ExcepcioButacaLliure() {}
	
	public ExcepcioButacaLliure(String message) {
		super(message);
	}
	
	public String getMessage() {
		return "Aquesta butaca està lliure.";
	}

}
