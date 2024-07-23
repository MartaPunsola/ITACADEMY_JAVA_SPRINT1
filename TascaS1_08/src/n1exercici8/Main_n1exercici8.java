package n1exercici8;

public class Main_n1exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManipulateString reverseFunction = str -> (new StringBuilder(str).reverse().toString());
				
		System.out.println("Reversing the string \"cow\": " + reverseFunction.reverse("cow") + ".");
		
		
		

	}

}
