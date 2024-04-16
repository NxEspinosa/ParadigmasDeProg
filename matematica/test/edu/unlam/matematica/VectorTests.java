package edu.unlam.matematica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTests {

	@Test
	void test() {
		//arrange 
		Vector v1 = new Vector(1, 2, 3);
		Vector v2 = new Vector(4, 5, 6);
		
		//act
		
		//assert
		assertEquals(new Vector(5, 7, 9), v1.sumarVectores(v2));		
	}

}
