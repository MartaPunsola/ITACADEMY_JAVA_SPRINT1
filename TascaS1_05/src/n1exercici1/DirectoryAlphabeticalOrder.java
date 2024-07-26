package n1exercici1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryAlphabeticalOrder {
	
	public static void enterDirectory() {
		Scanner entry = new Scanner(System.in);
		System.out.println("Enter directory path:");
		File directoryPath = new File(entry.nextLine());
		entry.close();
		
		if (!directoryPath.isDirectory()) {
	        System.err.println("Error: The provided path is not a directory.");
	    }
		sortDirectory(directoryPath);
	}	
		
	private static void sortDirectory(File directoryPath) {
    	String[] directoryList = directoryPath.list();
    	    	
    	if(directoryList == null) {
    		System.err.println("The path is not valid.");
    	}
    	
    	Arrays.sort(directoryList);
		for (String s : directoryList) {
			System.out.println(s);
		}
    }
    	
    	
    
    


}

 