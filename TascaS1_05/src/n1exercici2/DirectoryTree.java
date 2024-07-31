package n1exercici2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryTree {
	
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
    	File[] directoryList = directoryPath.listFiles();
    	
    	if(directoryList == null || directoryList.length == 0) {
    		System.out.println("There are no elements in this directory.");
    		    		    		
    	} 
    	
    	Arrays.sort(directoryList);
		for(int i = 0; i < directoryList.length; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			File directoryElement = directoryList[i];
			System.out.println(String.format("%s (%s) - %s", 
							directoryElement.getName(),
							directoryElement.isDirectory() ? "D" : "F",
							"Last modified: " + sdf.format(directoryElement.lastModified())
							));
			if(directoryElement.isDirectory()) {
				sortDirectory(directoryElement);
				
			}
		}
    
    }
    
}

 