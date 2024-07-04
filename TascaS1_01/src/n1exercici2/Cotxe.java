package n1exercici2;

public class Cotxe {
	
	private static final String MARCA  = "Volvo";
	private static String model = "";
	private final int POTENCIA;
	
	
	public Cotxe() {
		this.POTENCIA = 500;
	}
	
	public Cotxe(int POTENCIA) {
		this.POTENCIA = POTENCIA;
	}
	
	static {
		Cotxe.model = "V40";
	}
	
	
	public static String frenar() {
		return "El vehicle està frenant.";
	}
	
	public String accelerar() {
		return "El vehicle està accelerant.";
	}
	
	@Override
	public String toString() {
		return "Sóc un cotxe de la marca " + Cotxe.MARCA + ", del model " + Cotxe.model + 
				", amb una potència de " + this.POTENCIA + " CV.";
	}

}
