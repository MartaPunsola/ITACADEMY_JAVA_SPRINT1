package n1exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("work", "cloud", "apple", "sentence", "option", "car", "dog", "house", "sister");
		List<String> wordsWithO = words.stream().filter(w -> w.contains("o")).collect(Collectors.toList());
		
		System.out.println("Words that contain the letter 'o':");
		wordsWithO.forEach(w -> System.out.println(w));
		
		
		
	}
	
}
