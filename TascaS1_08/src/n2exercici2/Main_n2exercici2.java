package n2exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_n2exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listOfIntegers = Arrays.asList(3, 55, 44, 58, 17, 60, 22);
		
		String oddsAndEnds = listOfIntegers.stream()
										.map(n -> ((n % 2 == 0) ? "e" : "o") + n)
										.collect(Collectors.joining(", "));
				
		System.out.println("List of odds and ends: " + oddsAndEnds + ".");
		
	}

}
