package n1exercici1;

public abstract class Instrument {
	
	
	private String nom;
	private float preu;
	
	public Instrument(String nom, float preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	{
		System.out.println("Bloc d'inicialització.");
	}
	
	static {
		System.out.println("Bloc estàtic.");
	} 
	
	public String getNom() {
		return this.nom;
	}
	
	public float getPreu() {
		return this.preu;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPreu(float preu) {
		this.preu = preu;
	}
	
	public abstract String tocar();
	
	public static void metodeEstatic() {
		System.out.println("Aquest és un mètode estàtic.");
	}
	
}
