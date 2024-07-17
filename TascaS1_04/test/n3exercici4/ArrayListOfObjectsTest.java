package n3exercici4;

import n3exercici1.Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

class ArrayListOfObjectsTest {
	
	private ArrayList<Object> listOfObjects;
	private Product bottle;
	private Object obj;
	private String sentence;
	
	@BeforeEach
	public void setUp() {
		listOfObjects = new ArrayList<Object>();
		bottle = new Product("bottle", 1.3f);
		obj = new Object();
		sentence = "This is a sentence";
		listOfObjects.add(bottle);
		listOfObjects.add(obj);
		listOfObjects.add(sentence);
	}

	@Test
	@DisplayName("Checking that the objects have been added to the list in order.")
	public void ListSortedInOrder() {
		assertThat(listOfObjects).containsExactly(bottle, obj, sentence);
		
	}
	
	@Test
	@DisplayName("Checking that the objects are in the list in any order.")
	public void ListSortedInAnyOrder() {
		assertThat(listOfObjects).containsExactlyInAnyOrder(bottle, obj, sentence);
	}
	
	@Test
	@DisplayName("Checking that the list contains \"sentence\" only once and does not contain \"bottle\" after removing it.")
	public void TestingContent() {
		assertThat(listOfObjects).containsOnlyOnce(sentence);
		listOfObjects.remove(0);
		assertThat(listOfObjects).doesNotContain(bottle);
	}

}
