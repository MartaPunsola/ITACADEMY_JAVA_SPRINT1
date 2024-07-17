package n3exercici6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ExceptionTest {
	
	@Test
	@DisplayName("Checking that an exception of type ArrayIndexOutOfBoundsException is thrown:")
	public void ExceptionIsThrown() {
		assertThatThrownBy(() -> {
			int[] numbers = {5, 86, 17};
			int num = numbers[3];
		}).isInstanceOf(ArrayIndexOutOfBoundsException.class);
		
		
	}
	
}
