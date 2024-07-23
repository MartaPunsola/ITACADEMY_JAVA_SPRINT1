package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class Main_n1exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December");
		
		System.out.println("The twelve months of the year:");
		months.forEach(System.out::println);

	}

}
