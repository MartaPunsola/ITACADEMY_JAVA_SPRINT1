package n2exercici1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryTxt {
	
	public static void getDirectory() {
		File directoryPath = new File("src/n2exercici1/Directory");
		
		if (!directoryPath.isDirectory()) {
	        System.err.println("Error: The provided path is not a directory.");
	    }
		sortDirectory(directoryPath);
		System.out.println("A new .txt file named \"DirectoryTree\" has been successfully created.");
		
	}	
		
	private static void sortDirectory(File directoryPath) {
    	File[] directoryList = directoryPath.listFiles();
    	String line = "";
    	
    	if(directoryList == null || directoryList.length == 0) {
    		System.out.println("There are no elements in this directory.");
    		    		    		
    	} 
    	
    	Arrays.sort(directoryList);
		for(int i = 0; i < directoryList.length; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			File directoryElement = directoryList[i];
			
			if(directoryElement.isDirectory()) {
				line = String.format("%s (%s) - %s", 
						directoryElement.getName(),
						 "D", "Last modified: " + sdf.format(directoryElement.lastModified()));
				writeTxtFile(line);
				sortDirectory(directoryElement);
			} else if(directoryElement.isFile()) {
				line = String.format("%s (%s) - %s", 
						directoryElement.getName(),
						"F", "Last modified: " + sdf.format(directoryElement.lastModified()));
				writeTxtFile(line);
			}
			
		}
				
    }
	
	private static void writeTxtFile(String line) {
		try { 
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/n2exercici1/DirectoryTree.txt", true));
			bufferedWriter.write(line + "\n");
			bufferedWriter.close();
		} catch (IOException e) { 
      	System.out.println("An error occurred: " + e.getClass().getName());
      	
      } 
	}

}
