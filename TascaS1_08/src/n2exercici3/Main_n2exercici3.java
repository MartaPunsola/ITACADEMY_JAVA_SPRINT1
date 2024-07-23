package n2exercici3;

public class Main_n2exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation addition = (x, y) -> x + y;
		Calculation subtraction = (x, y) -> x - y;
		Calculation multiplication = (x, y) -> x * y;
		Calculation division = (x, y) -> x / y;
		
		float x = 15.5f, y = 6.1f;
		
		System.out.println("The result of the addition is: " + addition.operation(x, y) + ".");
		System.out.println("The result of the subtraction is: " + subtraction.operation(x, y) + ".");
		System.out.println("The result of the multiplication is: " + multiplication.operation(x, y) + ".");
		System.out.println("The result of the division is: " + division.operation(x, y) + ".");
		
	}

}
