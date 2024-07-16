package n1exercici1;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("The parameters can be introduced in any given order:");
		NoGenericMethods exhibit1 = new NoGenericMethods("pumpkin", "bat", "flower");
		NoGenericMethods exhibit2 = new NoGenericMethods("bat", "pumpkin", "flower");
		NoGenericMethods exhibit3 = new NoGenericMethods("flower", "pumpkin", "bat");
		
		System.out.println("First example:\n" + exhibit1 + "\n");
		System.out.println("Second example:\n" + exhibit2 + "\n");
		System.out.println("Third example:\n" + exhibit3 + "\n");
	}

}
