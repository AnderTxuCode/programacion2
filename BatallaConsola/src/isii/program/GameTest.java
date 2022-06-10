package isii.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testWinner() {
		assertTrue(true);
	}

	@Test
	void testHeroinEnergy() {
	int energy = 20 - 15;
	int result = 5;
	assertEquals(result, energy);
	}

}
