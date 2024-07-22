package n2exercici1;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main_n2exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		serializeObjectToJson();
		
	}
	
	private static void serializeObjectToJson() {
		ObjectMapper mapper = new ObjectMapper();
		Worker worker1 = new Worker("Betty", "Carlson", 20.05f);
		JsonSerializer annotation = worker1.getClass().getAnnotation(JsonSerializer.class);
		String directory = annotation.directory();
		File jsonFile = new File(directory);
		
		if (annotation != null && worker1.getClass().isAnnotationPresent(JsonSerializer.class)) {
			try {
				mapper.writeValue(jsonFile, worker1);
				System.out.println("The new JSON file has been successfully created.");
			} catch (Exception e) {
				System.err.println("An error occurred: " + e.getClass().getName());
			}
		}
				
	}

}
