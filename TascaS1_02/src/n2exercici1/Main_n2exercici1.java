package n2exercici1;


public class Main_n2exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte edat = 0;
		int mesos = 0;
		float cost = 0f;
		double pi = 0d;
		boolean si = false;
		char caracter = ' ';
		String nom = "";
		
		edat = Entrada.llegirByte("Introdueix la teva edat:");
		mesos = Entrada.llegirInt("Quants mesos té un any?");
		cost = Entrada.llegirFloat("Quant costa un cafè?");
		pi = Entrada.llegirDouble("Quin és el número pi?");
		caracter = Entrada.llegirChar("Introdueix qualsevol caràcter:");
		nom = Entrada.llegirString("Introdueix el teu nom de pila:");
		si = Entrada.llegirSiNo("Introdueix una 's' o una 'n':");
		
	}

}
