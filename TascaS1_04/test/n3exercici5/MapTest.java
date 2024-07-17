package n3exercici5;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.HashMap;

class MapTest {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeEach
	public void setUp() {
		map.put("Name", "Position");
		map.put("John Smith", "CEO");
		map.put("Mary Lock", "Head of Accounting");
	}

	@Test
	@DisplayName("Checking that a map contains a specific key.")
	public void KeyMapVerify() {
		assertThat(map).containsKey("Name");
	}
	

}
