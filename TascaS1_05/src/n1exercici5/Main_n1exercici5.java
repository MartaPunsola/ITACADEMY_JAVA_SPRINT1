package n1exercici5;

import java.io.*;

public class Main_n1exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product bottle = new Product("bottle", 1.3f);
		
		try {
			ObjectOutputStream serObject = new ObjectOutputStream(new FileOutputStream("src/n1exercici5/bottle.ser"));
			serObject.writeObject(bottle);
			serObject.close();
			System.out.println("The object has been successfully serialized.");
			
			ObjectInputStream recoverObject = new ObjectInputStream(new FileInputStream("src/n1exercici5/bottle.ser"));
			Product recoveredBottle = (Product)recoverObject.readObject();
			recoverObject.close();
			System.out.println("Deserializing the object:\n" + recoveredBottle.toString());

	} catch (Exception e) {
		System.err.println("An error occurred: " + e.getClass().getName());
	}

}
	
}	
