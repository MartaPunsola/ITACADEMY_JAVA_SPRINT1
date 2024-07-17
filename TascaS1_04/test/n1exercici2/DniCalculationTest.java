package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DniCalculationTest {
	
	@ParameterizedTest
	@DisplayName("Checking that the method dniLetter() works.")
	@CsvSource({"47657222, A", "45826357, F", "42863579, C", "39876542, Q", "48963527, T", "32564879, F",
		"42398615, R", "39562843, Z", "46237951, Q", "42273698, C"})
	public void letterDniTest(int dniNumber, char expectedLetter) {
		char letter = DniCalculation.dniLetter(dniNumber);
		assertEquals(expectedLetter, letter);
	}

	
}
