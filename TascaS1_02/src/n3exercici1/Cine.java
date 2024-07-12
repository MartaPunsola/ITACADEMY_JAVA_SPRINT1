package n3exercici1;

import java.util.Scanner;

public class Cine {
	
	private static Scanner entrada = new Scanner(System.in);
	
	private int numFiles;
	private int numSeients;
	private GestioButaques gestBut;
	
	public Cine() {
		this.gestBut = new GestioButaques();
		demanarDadesInicials();
	}
	
	public void iniciar() {
		int opcio = 0;
		
		do {
			opcio = menu();
			
			switch(opcio) {
				case 1:
					mostrarButaques();
					break;
				case 2:
					mostrarButaquesPersona();
					break;
				case 3:
					reservarButaca();
					break;
				case 4:
					anularReserva();
					break;
				case 5:
					anularReservaPersona();
					break;	
				case 0:
					System.out.println("Adéu! Fins la propera!");
					break;
				default:
					System.out.println("Dada invàlida. Introdueix una xifra del 0 al 5.");
			}
			
		} while(opcio != 0);
	}
	
	public int menu() {
		int opcio = 0;
		
		System.out.println("Indica què desitges fer:\n"
				+ "1. Mostrar totes les butaques reservades."
				+ "\n2. Mostrar les butaques reservades per una persona."
				+ "\n3. Reservar una butaca."
				+ "\n4. Anul·lar la reserva d’una butaca."
				+ "\n5. Anul·lar totes les reserves d’una persona."
				+ "\n0. Sortir.");
		opcio = entrada.nextInt();
		return opcio;
		
	}
	
	public void mostrarButaques() {
		
		if(this.gestBut.getButaques().isEmpty()) {
			System.out.println("No hi ha cap butaca reservada.");
		} else {
			System.out.println("Butaques reservades:");
			for (Butaca b : this.gestBut.getButaques()) {
				System.out.println(b.toString());
			}
		}
	}
	
	public void mostrarButaquesPersona() {
		String nomClient = "";
		boolean nomClientOk = false;
		int clientTrobat = -1;
		
		do {
			try {
				entrada.nextLine();
				nomClient = introduirPersona();
				nomClientOk = true;
			} catch (ExcepcioNomPersonaIncorrecte e) {
				System.out.println(e.getMessage());

			} 
		} while (!nomClientOk);
		
		clientTrobat = cercaClient(nomClient);
		
		if(clientTrobat == -1) {
			System.out.println("Aquest client no té cap reserva.");
		} else {
			System.out.println("Les reserves del client " + nomClient + " són les següents:");
			for (Butaca b : this.gestBut.getButaques()) {
				if(b.getNomClient().equalsIgnoreCase(nomClient)) {
					System.out.println(b.toString());
				}
			}
		}
	}
	
	public void reservarButaca() {
		int fila = 0, seient = 0;
		String nomClient = "";
		boolean filaOk = false, seientOk = false, nomClientOk = false;
		
		do {
			try {
				fila = introduirFila();
				filaOk = true;
			} catch (ExcepcioFilaIncorrecta e) {
				System.out.println(e.getMessage());

			} 
		} while (!filaOk);
		
		do {
			try {
				seient = introduirSeient();
				seientOk = true;
			} catch (ExcepcioSeientIncorrecte e) {
				System.out.println(e.getMessage());

			} 
		} while (!seientOk);
		
		do {
			try {
				nomClient = introduirPersona();
				nomClientOk = true;
			} catch (ExcepcioNomPersonaIncorrecte e) {
				System.out.println(e.getMessage());

			} 
		} while (!nomClientOk);
		
		Butaca b = new Butaca(fila, seient, nomClient);
		try {
			this.gestBut.afegirButaca(b);
			System.out.println("La butaca ha estat reservada amb èxit.");
		} catch (ExcepcioButacaOcupada e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void anularReserva() {
		int fila = 0, seient = 0;
		boolean filaOk = false, seientOk = false;
		
		do {
			try {
				fila = introduirFila();
				filaOk = true;
			} catch (ExcepcioFilaIncorrecta e) {
				System.out.println(e.getMessage());

			} 
		} while (!filaOk);
		
		do {
			try {
				seient = introduirSeient();
				seientOk = true;
			} catch (ExcepcioSeientIncorrecte e) {
				System.out.println(e.getMessage());

			} 
		} while (!seientOk);
		
		
		try {
			this.gestBut.eliminarButaca(fila, seient);
			System.out.println("La butaca ha estat eliminada amb èxit.");
		} catch (ExcepcioButacaLliure e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void anularReservaPersona() {
		int fila = 0, seient = 0, clientTrobat = -1;
		String nomClient = "";
		boolean nomClientOk = false;
		
		do {
			try {
				entrada.nextLine();
				nomClient = introduirPersona();
				nomClientOk = true;
			} catch (ExcepcioNomPersonaIncorrecte e) {
				System.out.println(e.getMessage());

			} 
		} while (!nomClientOk);
		
		clientTrobat = cercaClient(nomClient);
		
		if(clientTrobat == -1) {
			System.out.println("Aquest client no té cap reserva.");
		} else {
			for(int i = 0; i < this.gestBut.getButaques().size(); i++) {
				if(this.gestBut.getButaques().get(i).getNomClient().equalsIgnoreCase(nomClient)) {
					fila = this.gestBut.getButaques().get(clientTrobat).getFila();
					seient = this.gestBut.getButaques().get(clientTrobat).getSeient();
					try {
						this.gestBut.eliminarButaca(fila, seient);
						
					} catch (ExcepcioButacaLliure e) {
						System.out.println(e.getMessage());
					} 
					i--;
				}
			}
			System.out.println("Les butaques del client " + nomClient + " han estat eliminades amb èxit.");
		}
		
	}
	
	public String introduirPersona() throws ExcepcioNomPersonaIncorrecte {
		String nomClient = "";
		int i = 0;
		boolean isDigit = false;
		
		System.out.println("Indica el nom del client:");
		nomClient = entrada.nextLine();
		
		char[] chain_nomClient = nomClient.toCharArray(); 
		while ((i < chain_nomClient.length) && !isDigit) {
			if(Character.isDigit(chain_nomClient[i])) {
				isDigit = true;
			}
			i++;
		}
		
		if (isDigit) {
			throw new ExcepcioNomPersonaIncorrecte("El nom no pot contenir xifres.");
		} 
		return nomClient;
	}
	
	public void demanarDadesInicials() {
		System.out.println("Quantes files té el cinema?");
		this.numFiles = entrada.nextInt();
		System.out.println("Quants seients té el cinema?");
		this.numSeients = entrada.nextInt();
	}
	
	public int introduirFila() throws ExcepcioFilaIncorrecta {
		int fila = 0;
		System.out.println("Indica la fila:");
		fila = entrada.nextInt();
		if ((fila < 1) || (fila > this.numFiles)) {
			throw new ExcepcioFilaIncorrecta("Aquesta fila no existeix.");
		} 
		return fila;
	}
	
	public int introduirSeient() throws ExcepcioSeientIncorrecte {
		int seient = 0;
		System.out.println("Indica el seient:");
		seient = entrada.nextInt();
		entrada.nextLine();
		if ((seient < 1) || (seient > this.numSeients)) {
			throw new ExcepcioSeientIncorrecte("Aquest seient no existeix.");
		} 
		return seient;
	}
	
	public int cercaClient(String nomClient) {
		int i = 0, clientTrobat = -1;
		
		while((i < this.gestBut.getButaques().size()) && (clientTrobat == -1)) {
			if(this.gestBut.getButaques().get(i).getNomClient().equalsIgnoreCase(nomClient)) {
				clientTrobat = i;
			} else {
				clientTrobat = -1;
			}
			i++;
		}
		return clientTrobat;
	}
	}




