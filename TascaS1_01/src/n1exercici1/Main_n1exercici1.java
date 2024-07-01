package n1exercici1;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Càrrega per accés a un membre estàtic de la classe
		Instrument.metodeEstatic();
		
		//Càrrega per la creació d'instàncies
		InstrumentCorda instrument1 = new InstrumentCorda("violí", 583.15f);
		InstrumentVent instrument2 = new InstrumentVent("clarinet", 654.85f);
		InstrumentPercussio instrument3 = new InstrumentPercussio("bateria", 863.57f);
		
		//Comprovació del funcionament dels mètodes
		System.out.println(instrument1.tocar());
		System.out.println(instrument2.tocar());
		System.out.println(instrument3.tocar());
		

	}

}
