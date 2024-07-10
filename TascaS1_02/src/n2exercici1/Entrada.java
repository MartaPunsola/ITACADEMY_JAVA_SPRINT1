package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static byte llegirByte(String missatge) {
		byte edat = 0;
		boolean edatOk = false;
		
		while(!edatOk) {
			try {
				System.out.println(missatge);
				edat = entrada.nextByte();
				System.out.println("La teva edat és " + edat + " anys.");
				edatOk = true;
			} catch(InputMismatchException e) {
				System.out.println("Error de format. Has d'introduir l'edat en xifres.");
				entrada.nextLine();
			}
		}
		return edat;
	}
	
	public static int llegirInt(String missatge) {
		int mesos = 0;
		boolean mesosOk = false;
		
		while(!mesosOk) {
			try {
				System.out.println(missatge);
				mesos = entrada.nextInt();
				System.out.println("Un any té " + mesos + " mesos.");
				mesosOk = true;
			} catch(InputMismatchException e) {
				System.out.println("Error de format. Has d'introduir el nombre de mesos en xifres."); 
				entrada.nextLine();
			}
		}	
		return mesos;
	}
	
	public static float llegirFloat(String missatge) {
		float cost = 0f;
		boolean costOk = false;
		
		while(!costOk) {
			try {
				System.out.println(missatge);
				cost = entrada.nextFloat();
				System.out.println("Un cafè costa " + cost + " euros.");
				costOk = true;
			} catch(InputMismatchException e) {
				System.out.println("Error de format. Recorda introduir els decimals amb una coma.");
				entrada.nextLine();
			}
		}
		
		return cost;
	}
	
	public static double llegirDouble(String missatge) {
		double pi = 0d;
		boolean piOk = false;
		
		while(!piOk) {
			try {
				System.out.println(missatge);
				pi = entrada.nextDouble();
				System.out.println("El número pi és " + pi + ".");
				piOk = true;
			} catch(InputMismatchException e) {
				System.out.println("Error de format. Recorda introduir els decimals amb una coma.");
				entrada.nextLine();
			}
		}
		return pi;
	}
	
	public static char llegirChar(String missatge) {
		char caracter = ' ';
		boolean caracterOk = false;
		
		 do {
			try {
				System.out.println(missatge);
				caracter = entrada.next().charAt(0);
				System.out.println("El caràcter introduït és " + caracter + ".");
				caracterOk = true;
			} catch(Exception e) {
				System.out.println("Error. Torna a introduir la dada.");
				entrada.nextLine();
			} 
		} while(!caracterOk);
		return caracter;
	}
	
	public static String llegirString(String missatge) {
		String nom = "";
		boolean nomOk = false;
		
		do {
			try {
				System.out.println(missatge);
				nom = entrada.next();
				System.out.println("El teu nom és " + nom + ".");
				nomOk = true;
			} catch(Exception e) {
				System.out.println("Error. Torna a introduir la dada.");
				entrada.nextLine();
			}
		} while(!nomOk);
		return nom;
	}
	
	public static boolean llegirSiNo(String missatge) {
		String resposta = "";
		boolean si = false, siOk = false;
		
		do {
			try {
				System.out.println(missatge);
				resposta = entrada.next();
				if(resposta.equalsIgnoreCase("n")) { 
					si = false;
				} else if(resposta.equalsIgnoreCase("s")) {
					si = true;
				}
				System.out.println("La teva resposta és " + si + "."); 
				siOk = true;
			} catch(Exception e) {
				System.out.println("Error. Torna a introduir la dada.");
				entrada.nextLine();
			}
		} while(!siOk); 
		return si;
	}

}
