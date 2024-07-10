package n1exercici1;

public class EmptySaleException extends Exception {
	
	public EmptySaleException() {}
	
	public EmptySaleException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "To sell a product you need to add it first.";
	}


}
