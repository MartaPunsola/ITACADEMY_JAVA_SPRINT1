package n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main_n1exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int points = 0;
		String userName = "", capital = "", country = "", capitalOk = "";
		Random random = new Random(); 
		List<String> keys = null;
		HashMap<String, String> countries = createList();
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Welcome to \"Guess the capital\". Introduce your name:");
		userName = entry.next();
		
		for(int i = 0; i < 10; i++) {
			keys = new ArrayList<String>(countries.keySet());
			country = keys.get(random.nextInt(keys.size()));
			capitalOk = countries.get(country);
			
			System.out.println("Introduce the capital of " + country + ":");
			capital = entry.next();
			
			if(capital.equalsIgnoreCase(capitalOk)) {
			 System.out.println("Correct! You get 1 point!");
				points++;
			} else {
				System.out.println("Incorrect! The correct answer is: " + capitalOk + ".");
			}
			
		}
		
		saveResults(userName, points);
		System.out.println("This is the end of the game. Your total score is: " + points + " points.");
		entry.close();
		
        } 
    
	private static HashMap<String, String> createList() {
		String line = "";
		String items [] = null;
		HashMap<String, String> countries = new HashMap<String, String>();
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src/n1exercici3/countries.txt"));
			
			while((line = bufferedReader.readLine()) != null) {
				if(!line.isEmpty()) {
					items = line.split(" ");
					countries.put(items[0], items[1]);
				}
			}
			bufferedReader.close();
			
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getClass().getName());
		}
		return countries;
	}
	
	private static void saveResults(String userName, int points ) {
		try { 
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/n1exercici3/results.txt"));
			 bufferedWriter.write(userName + ": " + points + " points");
			 bufferedWriter.close();
       } catch (IOException e) { 
       	System.out.println("An error occurred: " + e.getClass().getName());
       	
       } 
	}

}
