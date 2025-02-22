package no.hvl.dat102;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestSoking {

	private final Integer[] tab  = {7, 14, 17, 3, 12, 17, 6, 10, 14, 11};
	private final Integer[] tab2 = {5};
	private final Integer[] tab3 = {};
	private final Integer[] tab4 = null;

	/* Lag de andre naturlige testene */


	@Test
	void nullTabell() {
		// Test for en null-tabell
		assertThrows(NullPointerException.class, () -> SorteringOgSoking.sok(tab4, 0, tab4.length - 1, 1));
	}
}
