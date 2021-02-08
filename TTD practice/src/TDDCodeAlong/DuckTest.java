package TDDCodeAlong;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuckTest {

	@Test
	void initialToString() {
		Driver driver = new Driver("white",12);
		String expected = "Ducks{color='white','age='12'}";
		assertEquals(expected,driver.toString());
	}

}
