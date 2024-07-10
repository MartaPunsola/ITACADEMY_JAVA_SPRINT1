package n1exercici1;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sale sale1 = new Sale();
		
		try {
			sale1.calculateTotal();
		} catch(EmptySaleException e) {
			System.out.println(e.getMessage());
		}
		
		
		int[] myNum = {54, 78, 62, 15};
		
		try {
			System.out.println(myNum[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access a list member that doesn't exist.");
		}
		
		

	}

}
