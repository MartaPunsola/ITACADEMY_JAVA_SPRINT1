package n2exercici1;


public class Smartphone extends Telefon implements Camera, Rellotge {

	
	public Smartphone(String marca, String model) {
		super(marca, model);
	}
	
	@Override
	public String fotografiar() {
		return "S’està fent una foto.";
	}
	
	@Override
	public String alarma() {
		return "Està sonant l’alarma.";
	}

}
