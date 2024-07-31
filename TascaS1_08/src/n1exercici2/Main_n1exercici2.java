package n1exercici2;

import java.util.*;
import java.util.stream.Collectors;

public class Main_n1exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("wonder", "cloud", "apple", "sentence", "option", "car", "radiation", "house", "sister");
		List<String> wordsWithO = words.stream().filter(w -> (w.contains("o") || w.contains("O")) && w.length() > 5).collect(Collectors.toList());
		
		System.out.println("Words that contain the letter 'o' and have more than five letters:");
		wordsWithO.forEach(w -> System.out.println(w));
		
	}

}
