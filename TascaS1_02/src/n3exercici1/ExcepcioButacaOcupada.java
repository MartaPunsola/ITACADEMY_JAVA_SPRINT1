package n3exercici1;

public class ExcepcioButacaOcupada extends Exception{
	
	public ExcepcioButacaOcupada() {}
	
	public ExcepcioButacaOcupada(String message) {
		super(message);
	}
	
	public String getMessage() {
		return "Aquesta butaca està ocupada.";
	}

}
