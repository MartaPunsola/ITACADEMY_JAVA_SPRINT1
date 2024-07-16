package n2exercici2;

public class GenericMethods {
	
	public static <T> void genericMethod(T [] a) {
		for (T t : a) {
			System.out.println(t);
		}
	}
	
}
