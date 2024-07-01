package n3exercici1;

import java.util.ArrayList;

public class Redactor {
	
	private String nom;
	private String dni;
	private double sou;
	private ArrayList<Noticia> noticies;
	
	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
		this.sou = 1500;
		this.noticies = new ArrayList<Noticia>();
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public double getSou() {
		return this.sou;
	}
	
	public ArrayList<Noticia> getNoticies() {
		return this.noticies;
	}
		
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setSou(double sou) {
		this.sou = sou;
	}
	
	public void setNoticies(Noticia noticia) {
		this.noticies.add(noticia);
	}
		
	public String mostraNoticies() {
		String resposta = "";
		for(Noticia noticia : noticies) {
			resposta = noticia.toString() + "\n";
		}
		return resposta;
	}
	
	public String toString() {
		return "Dades del redactor:\n"
				+ "Nom: " + this.nom
				+ "\nDNI: " + this.dni
				+ "\nSou: " + this.sou
				+ "\nNotícies:" + this.noticies;
	}

}
