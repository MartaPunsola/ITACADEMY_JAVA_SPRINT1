package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

class YearTest {
	
	static ArrayList<String> listMonths;
	
	@BeforeAll
	public static void setUp() {
		Year year = new Year();
		listMonths = year.getMonths();
	}
	

	@Test
	@DisplayName("Checking that the list has 12 items.")
	public void sizeList() {
		assertEquals(12, listMonths.size());
	}
	
	@Test
	@DisplayName("Checking that the list is not null.")
	public void listIsNotNull() {
		assertNotNull(listMonths);
	}
	
	@Test
	@DisplayName("Checking that August is in the correct position.")
	public void augustPosition() {
		assertEquals("August", listMonths.get(7));
	}
	

}
