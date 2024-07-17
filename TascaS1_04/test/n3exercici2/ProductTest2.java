package n3exercici2;

import n3exercici1.Product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ProductTest2 {
	
	@Test
	@DisplayName("Checking that two references refer to the same object.")
	public void productSameReference() {
		Product product1 = new Product("bottle", 1.3f);
		Product bottle = product1;
		assertThat(product1).isSameAs(bottle);
	}
	
	@Test
	@DisplayName("Checking that two references do not refer to the same object.")
	public void productNotSameReference() {
		Product product1 = new Product("bottle", 1.3f);
		Product product2 = new Product("backpack", 30.45f);
		assertThat(product1).isNotSameAs(product2);
	}

}
