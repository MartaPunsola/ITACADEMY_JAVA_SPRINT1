package n3exercici1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ProductTest {
	
	@Test
	@DisplayName("Checking if two products are equal.")
	public void productsAreEqual() {
		Product product1 = new Product("bottle", 1.3f);
		Product product2 = new Product("bottle", 1.3f);
		assertThat(product1).isEqualTo(product2);
	}
	
	@Test
	@DisplayName("Checking if two products are not equal.")
	public void productsAreNotEqual() {
		Product product1 = new Product("bottle", 1.3f);
		Product product2 = new Product("backpack", 30.45f);
		assertThat(product1).isNotEqualTo(product2);
	}

}
