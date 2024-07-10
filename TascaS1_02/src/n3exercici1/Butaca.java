package n3exercici1;

public class Butaca {
	
	
	private int fila;
	private int seient;
	private String nomClient;
	
	public Butaca(int fila, int seient, String nomClient) {
		this.fila = fila;
		this.seient = seient;
		this.nomClient = nomClient;
	}
	
	public int getFila() {
		return this.fila;
	}
	
	public int getSeient() {
		return this.seient;
	}
	
	public String getNomClient() {
		return this.nomClient;
	}
	
	public boolean equals(Butaca b) {
		return ((this.fila == b.getFila()) && (this.seient == b.getSeient())) ? true : false;
	}
	
	@Override
	public String toString() {
		return "Fila: " + this.fila + ", Seient: " + this.seient + ", Persona: " + this.nomClient;
	}
}
