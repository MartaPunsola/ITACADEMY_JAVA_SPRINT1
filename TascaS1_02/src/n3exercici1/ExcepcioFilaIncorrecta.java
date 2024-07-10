package n3exercici1;

public class ExcepcioFilaIncorrecta extends Exception {
	
	public ExcepcioFilaIncorrecta() {}
	
	public ExcepcioFilaIncorrecta(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "Aquesta fila no existeix.";
	}

}
