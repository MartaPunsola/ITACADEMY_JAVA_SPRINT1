package n1exercici2;

public class GenericMethods {
	
	public static <T> String genericMethod(T a, T b, T c) {
		return "First argument: " + a + "\nSecond argument: " + b + "\nThird argument: " + c;
				
	}
}
