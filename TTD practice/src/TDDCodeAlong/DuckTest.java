package TDDCodeAlong;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuckTest {

	@Test
	void initialToString() {
		Ducks ducks = new Ducks("white",12);
		String expected = "Ducks{color='white','age='12'}";
		assertEquals(expected,ducks.toString());
	}
	@Test
	void defaultCostructor() {
		Ducks blankDucks = new Ducks();
		String expected = "Ducks{color='','age='0'}";
		assertEquals(expected,blankDucks.toString());
	}
}
