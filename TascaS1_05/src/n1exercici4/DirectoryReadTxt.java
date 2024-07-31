package n1exercici4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryReadTxt {
	
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
    	String line = "", filePath = "";
    	
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
									"D", "Last modified: " + sdf.format(directoryElement.lastModified()
									));
				writeTxtFile(line);
				sortDirectory(directoryElement);
			} else if(directoryElement.isFile()) {
				line = String.format("%s (%s) - %s", 
									directoryElement.getName(),
									"F", "Last modified: " + sdf.format(directoryElement.lastModified()
									));
				writeTxtFile(line);
				filePath = directoryElement.getAbsolutePath();
				readFile(filePath);
			}
			
		}
		
    }
	
	private static void writeTxtFile(String line) {
		try { 
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/n1exercici4/DirectoryTree.txt", true));
			bufferedWriter.write(line + "\n");
			bufferedWriter.close();
		} catch (IOException e) { 
			System.err.println("I/O error: " + e.getMessage());
      	
      } 
	}
	
	private static void readFile(String filePath) {
        String line = "";
		File file = new File(filePath);
        if(!file.getName().toLowerCase().endsWith(".txt")) { 
        	System.out.println("The path does not contain any .txt file.");
        } else {
        	try {
            	BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            	while ((line = bufferedReader.readLine()) != null) {
                    if (!line.isEmpty()) {
                        System.out.println(line);
                    }
                }
                bufferedReader.close();
                
            } catch (IOException e) {
                System.err.println("I/O error: " + e.getMessage());
            }
        }
                
    }

}
