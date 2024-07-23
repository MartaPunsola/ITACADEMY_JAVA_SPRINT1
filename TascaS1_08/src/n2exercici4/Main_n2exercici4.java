package n2exercici4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main_n2exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Object> numbersAndStrings = Arrays.asList(45, "potato", "This is a sentence.", 
				666, "car", "Supercalifragilisticexpialidocious", 49875);
		
		System.out.println("The list is sorted alphabetically by the first character:");
		numbersAndStrings.stream()
						.map(Object::toString)
						.sorted(Comparator.comparing(item -> item.toLowerCase().charAt(0)))
						.forEach(System.out::println);
		
		System.out.println();
		System.out.println("The strings that contain the letter \"e\" appear first:");
		numbersAndStrings.stream()
						.map(Object::toString)
						.sorted(Comparator.comparing(item -> item.contains("e") ? 0 : 1))
						.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Replacing the letter \"a\" with the number 4:");
		numbersAndStrings.stream()
						.map(Object::toString)
						.map(item -> item.replace("a", "4"))
						.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Filtering the numeric values:");
		numbersAndStrings.stream()
						.map(Object::toString)
						.filter(item -> item.matches("[0-9]+"))
						.forEach(System.out::println);

	}

}
