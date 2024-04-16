package unlam.paradigmas.objetos.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void testNotaFueraDeRango() {
		Nota nota = new Nota(-1);
		
		assertEquals(nota.obtenertNota(), 0);
	}
	
	@Test
	void testNotaFueraDeRango2() {
		Nota nota = new Nota(11);
		
		assertEquals(nota.obtenertNota(), 0);
	}
	
	@Test
	void testNotaOk() {
		Nota nota = new Nota(10);
		
		assertEquals(nota.obtenertNota(), 10);
	}
	
	
	@Test
	void testNotaOk2() {
		Nota nota = new Nota(1);
		
		assertEquals(nota.obtenertNota(), 1);
	}
	
	@Test
	void testAprobadotrue() {
		Nota nota = new Nota(4);
		assertTrue(nota.aprobado());
	}
	
	@Test
	void testAprobadoFalse() {
		Nota nota = new Nota(3);
		assertFalse(nota.aprobado());
	}
	
	@Test
	void testAprobadoFueraDeRango() {
		Nota nota = new Nota(11);
		boolean a = nota.aprobado();
		assertFalse(a);
	}
	
	@Test
	void testDesaprobadotrue() {
		Nota nota = new Nota(3);
		assertTrue(nota.desaprobado());
	}
	
	@Test
	void testDesaprobadoFalse() {
		Nota nota = new Nota(4);
		assertFalse(nota.desaprobado());
	}

	@Test
	void testRecueperar() {
		Nota nota = new Nota(4);
		nota.recuperar(5);
		assertEquals(nota.obtenertNota(), 5);
	}

	@Test
	void testRecueperar1() {
		Nota nota = new Nota(4);
		nota.recuperar(3);
		assertEquals(nota.obtenertNota(), 4);
	}
	
	@Test
	void testRecueperar2() {
		Nota nota = new Nota(4);
		nota.recuperar(4);
		assertEquals(nota.obtenertNota(), 4);
	}
	
	@Test
	void testRecueperar3() {
		Nota nota = new Nota(4);
		nota.recuperar(11);
		assertEquals(nota.obtenertNota(), 4);
	}


}
