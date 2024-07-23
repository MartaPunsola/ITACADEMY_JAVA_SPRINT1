package n2exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_n2exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Mary", "Oscar", "Ari", "James", "Sally", "Ander", "Amber", "Amy", "Ana", "Roger");
		List<String> namesOfThreeLettersStartingWithA = names.stream()
				.filter(n -> n.startsWith("A") && n.length() == 3)
				.collect(Collectors.toList());
		
		System.out.println("Names with three letters that start with an 'A':");
		namesOfThreeLettersStartingWithA.forEach(System.out::println);

	}

}
