package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main_n3exercici1 {
	static ArrayList<Redactor> redactors = new ArrayList<Redactor>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcio = 0, id = -1, esport = 0;
		String resposta = "", nom = "", dni = "", titular = "", text = "", competicio = "", club = "",
				jugador = "", tenista = "", escuderia = "", equip = "";
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Indica què desitges fer:\n"
					+ "1. Introduir redactor/a."
					+ "\n2. Eliminar redactor/a."
					+ "\n3. Introduir notícia a un redactor."
					+ "\n4. Eliminar una notícia."
					+ "\n5. Mostrar totes les notícies per redactor."
					+ "\n6. Calcular la puntuació d'una notícia."
					+ "\n7. Calcular el preu d'una notícia."
					+ "\n0. Sortir.");
			opcio = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcio) {
				case 1:
					System.out.println("Indica'n el nom:");
					nom = entrada.nextLine();
					System.out.println("Indica'n el DNI:");
					dni = entrada.nextLine();
					
					resposta = crearRedactor(nom, dni);
					break;
				case 2:
					System.out.println("Indica'n el nom:");
					nom = entrada.nextLine();
					resposta = eliminarRedactor(nom);
					break;
				case 3:
					System.out.println("A quin redactor vols vincular la notícia? Indica'n el nom:");
					nom = entrada.nextLine();
					
					id = buscarRedactor(nom);
					if(id == -1) {
						resposta = "Ho sentim; aquest redactor no consta al sistema.";
					} else {
						System.out.println("Introdueix el titular de la notícia:");
						titular = entrada.nextLine();
						System.out.println("Introdueix el text de la notícia:");
						text = entrada.nextLine();
						System.out.println("A quin esport fa referència?\n"
								+ "1. Futbol."
								+ "\n2. Bàsquet."
								+ "\n3. Tenis."
								+ "\n4. Fórmula 1."
								+ "\n5. Motociclisme."
								+ "\nIntrodueix el número corresponent.");
						esport = entrada.nextInt();
						entrada.nextLine();
						
						switch(esport) {
							case 1:
								System.out.println("De quina competició parla?");
								competicio = entrada.nextLine();
								System.out.println("A quin club fa referència?");
								club = entrada.next();
								System.out.println("A quin jugador fa referència?");
								jugador = entrada.next();
								resposta = altaNotFutbol(id, titular, text, competicio, club, jugador);
								break;
							case 2:
								System.out.println("De quina competició parla?");
								competicio = entrada.nextLine();
								System.out.println("A quin club fa referència?");
								club = entrada.next();
								resposta = altaNotBasquet(id, titular, text, competicio, club);
								break;
							case 3:
								System.out.println("De quina competició parla?");
								competicio = entrada.nextLine();
								System.out.println("A quin tenista fa referència?");
								tenista = entrada.next();
								resposta = altaNotTenis(id, titular, text, competicio, tenista);
								break;
							case 4:
								System.out.println("A quina escuderia fa referència?");
								escuderia = entrada.next();
								resposta = altaNotF1(id, titular, text, escuderia);
								break;
							case 5:
								System.out.println("A quin equip fa referència?");
								equip = entrada.next();
								resposta = altaNotMotociclisme(id, titular, text, equip);
								break;
							default:
								resposta = "Error. Dada invàlida.";
						}
						
					}
					
					break;
				case 4:
					System.out.println("A quin redactor està vinculada? Indica'n el nom:");
					nom = entrada.nextLine();
					System.out.println("Escriu el titular de la notícia:");
					titular = entrada.nextLine();
					
					resposta = eliminarNoticia(nom, titular);
					break;
				case 5:
					System.out.println("De quin redactor vols veure les notícies? Indica'n el nom:");
					nom = entrada.nextLine();
					
					resposta = mostrarNoticies(nom);
					break;
				case 6:
					System.out.println("A quin redactor està vinculada? Indica'n el nom:");
					nom = entrada.nextLine();
					System.out.println("Escriu el titular de la notícia:");
					titular = entrada.nextLine();
					
					resposta = calcularPunts(nom, titular);
					break;
				case 7:
					System.out.println("A quin redactor està vinculada? Indica'n el nom:");
					nom = entrada.nextLine();
					System.out.println("Escriu el titular de la notícia:");
					titular = entrada.nextLine();
					
					resposta = calcularPreu(nom, titular);
					break;
				case 0:
					resposta = "Has abandonat l'aplicació.";
					break;
				default:
					resposta = "Dada invàlida. Introdueix un número del 0 al 7.";
					
			}
			System.out.println(resposta);
			
		} while(opcio != 0);
		
		entrada.close();


	}
	
		public static String crearRedactor(String nom, String dni) {
			Redactor nouRedactor = new Redactor(nom, dni);
			redactors.add(nouRedactor);
			return (nouRedactor != null ? "El redactor ha estat creat correctament." : "Error en la creació del redactor. Torna-ho a intentar.");
		}
		
		public static String eliminarRedactor(String nom) {
			int idTrobat = -1;
			String resposta = "";
			idTrobat = buscarRedactor(nom);
			
			if(idTrobat == -1) {
				resposta = "Aquest redactor no apareix al sistema.";
			} else {
				redactors.remove(idTrobat);
				resposta = "Redactor eliminat.";
			}
			return resposta;
		}
		
		public static String altaNotFutbol(int id, String titular, String text, String competicio, String club, String jugador) {
			NotFutbol noticiaNova = new NotFutbol(titular, competicio, club, jugador);
			noticiaNova.setText(text);
			redactors.get(id).setNoticies(noticiaNova);
			return (noticiaNova != null ? "La notícia s'ha creat correctament." : "Error en la creació de la notícia. Torna-ho a intentar.");
		}
		
		public static String altaNotBasquet(int id, String titular, String text, String competicio, String club) {
			NotBasquet noticiaNova = new NotBasquet(titular, competicio, club);
			noticiaNova.setText(text);
			redactors.get(id).setNoticies(noticiaNova);
			return (noticiaNova != null ? "La notícia s'ha creat correctament." : "Error en la creació de la notícia. Torna-ho a intentar.");
		}
		
		public static String altaNotTenis(int id, String titular, String text, String competicio, String tenista) {
			NotTenis noticiaNova = new NotTenis(titular, competicio, tenista);
			noticiaNova.setText(text);
			redactors.get(id).setNoticies(noticiaNova);
			return (noticiaNova != null ? "La notícia s'ha creat correctament." : "Error en la creació de la notícia. Torna-ho a intentar.");
		}
		
		public static String altaNotF1(int id, String titular, String text, String escuderia) {
			NotF1 noticiaNova = new NotF1(titular, escuderia);
			noticiaNova.setText(text);
			redactors.get(id).setNoticies(noticiaNova);
			return (noticiaNova != null ? "La notícia s'ha creat correctament." : "Error en la creació de la notícia. Torna-ho a intentar.");
		}
		
		public static String altaNotMotociclisme(int id, String titular, String text, String equip) {
			NotMotociclisme noticiaNova = new NotMotociclisme(titular, equip);
			noticiaNova.setText(text);
			redactors.get(id).setNoticies(noticiaNova);
			return (noticiaNova != null ? "La notícia s'ha creat correctament." : "Error en la creació de la notícia. Torna-ho a intentar.");
		}
		
		public static String eliminarNoticia(String nom, String titular) {
			int idTrobat = -1, i = 0;
			boolean noticiaTrobada = false;
			Redactor redactorTrobat = null;
			String resposta = "";
			idTrobat = buscarRedactor(nom);
			
			if(idTrobat == -1) {
				resposta = "Ho sentim; aquest redactor no consta al sistema.";
			} else {
				redactorTrobat = redactors.get(idTrobat);
				while((i < redactorTrobat.getNoticies().size()) && (noticiaTrobada == false)) {
					if(redactorTrobat.getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
						redactorTrobat.getNoticies().remove(i);
						noticiaTrobada = true;
						resposta = "La notícia ha estat eliminada correctament.";
					} else {
						resposta = "Ho sentim; no hem pogut trobar aquesta notícia al sistema.";
					}
					i++;
				}
				
			}
			return resposta;
		}
		
		public static String mostrarNoticies(String nom) {
			int idTrobat = -1;
			String resposta = "";
			idTrobat = buscarRedactor(nom);
			
			if(idTrobat == -1) {
				resposta = "Ho sentim; aquest redactor no consta al sistema.";
			} else {
				resposta = "Les notícies d'aquest redactor són les següents:\n" + redactors.get(idTrobat).mostraNoticies();
			}
			return resposta;
		}
		
		public static String calcularPunts(String nom, String titular) {
			int idTrobat = -1, i = 0;
			boolean noticiaTrobada = false;
			Redactor redactorTrobat = null;
			String resposta = "";
			idTrobat = buscarRedactor(nom);
			
			if(idTrobat == -1) {
				resposta = "Ho sentim; aquest redactor no consta al sistema.";
			} else {
				redactorTrobat = redactors.get(idTrobat);
				while((i < redactorTrobat.getNoticies().size()) && (noticiaTrobada == false)) {
					if(redactorTrobat.getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
						resposta = "La puntuació de la notícia és de " + redactorTrobat.getNoticies().get(i).calcularPuntsNoticia();
						noticiaTrobada = true;
					} else {
						resposta = "Ho sentim; no hem pogut trobar aquesta notícia al sistema.";
					}
					i++;
				}
				
			}
			return resposta;
		}
		
		public static String calcularPreu(String nom, String titular) {
			int idTrobat = -1, i = 0;
			boolean noticiaTrobada = false;
			Redactor redactorTrobat = null;
			String resposta = "";
			idTrobat = buscarRedactor(nom);
			
			if(idTrobat == -1) {
				resposta = "Ho sentim; aquest redactor no consta al sistema.";
			} else {
				redactorTrobat = redactors.get(idTrobat);
				while((i < redactorTrobat.getNoticies().size()) && (noticiaTrobada == false)) {
					if(redactorTrobat.getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
						resposta = "El preu de la notícia és de " + redactorTrobat.getNoticies().get(i).calcularPreuNoticia();
						noticiaTrobada = true;
					} else {
						resposta = "Ho sentim; no hem pogut trobar aquesta notícia al sistema.";
					}
					i++;
				}
				
			}
			return resposta;
		}
		
		public static int buscarRedactor(String nom) {
			int i = 0, idTrobat = -1;
			while((i < redactors.size()) && (idTrobat == -1)) {
				if(redactors.get(i).getNom().equalsIgnoreCase(nom)) {
					idTrobat = i;
				}
				i++;
			}
			return idTrobat;
		}

}
