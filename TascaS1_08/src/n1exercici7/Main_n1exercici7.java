package n1exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main_n1exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> numbersAndStrings = Arrays.asList(45, "potato", "This is a sentence.", 
				666, "car", "Supercalifragilisticexpialidocious", 49875);
		
		System.out.println("The strings sorted by length from longest to shortest:");
		numbersAndStrings.stream()
						.map(Object::toString)
						.sorted(Comparator.comparing(String::length).reversed())
						.forEach(System.out::println);
		
	}

}
