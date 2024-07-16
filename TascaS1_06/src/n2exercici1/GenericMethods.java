package n2exercici1;

public class GenericMethods {
	
	public static <T> String genericMethod(T a, T b, int c) {
		return "First argument: " + a + "\nSecond argument: " + b + "\nThird argument: " + c;
	}
	
}
