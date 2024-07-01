package n1exercici2;


public class Main_n1exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instància amb el primer constructor
		Cotxe c1 = new Cotxe();
		//Instància amb el segon constructor
		Cotxe c2 = new Cotxe(100);
				
		//Invocació del mètode no estàtic	
		System.out.println(c1.accelerar());
		//Invocació del mètode estàtic
		System.out.println(Cotxe.frenar());
		
		//Comprovació del valor dels atributs
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
