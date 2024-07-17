package n3exercici3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ArrayOfIntegersTest {
	
	@Test
	@DisplayName("Checking that two arrays of integers are the same.")
	public void arraysSame() {
		int[] array1 = {45, 6, 18};
		int[] array2 = {45, 6, 18};
		assertThat(array1).containsExactly(array2);
	}

}
