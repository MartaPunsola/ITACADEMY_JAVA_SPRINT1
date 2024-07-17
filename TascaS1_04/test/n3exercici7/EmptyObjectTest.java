package n3exercici7;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

class EmptyObjectTest {
	
	@Test
	@DisplayName("Checking that an object is empty.")
	public void EmptyObject() {
		Optional<Object> object = Optional.empty();
		assertThat(object).isEmpty();
		
	}

}
