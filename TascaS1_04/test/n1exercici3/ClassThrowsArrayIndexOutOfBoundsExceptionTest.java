package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClassThrowsArrayIndexOutOfBoundsExceptionTest {

	@Test
	@DisplayName("Checking that ArrayIndexOutOfBoundsException is thrown.")
	void expectedExceptionTest() {
		assertThrows(ArrayIndexOutOfBoundsException.class, ClassThrowsArrayIndexOutOfBoundsException::generateException);
	}

}
