package n2exercici1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main_n2exercici1 {
	
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		InputStream entry = null;
		
		try {
			entry = new FileInputStream("src/n2exercici1/config.properties");
			properties.load(entry);
			properties.getProperty("directory");
			properties.getProperty("directoryTxt");
			entry.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("I/O error: " + e.getMessage());
		}
		
		DirectoryTxt.getDirectory();
		
	}
	
}
