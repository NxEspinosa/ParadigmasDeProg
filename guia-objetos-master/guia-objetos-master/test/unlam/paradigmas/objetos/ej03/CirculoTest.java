package unlam.paradigmas.objetos.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {
	
	Circulo circulo = new Circulo(3);

	@Test
	void testRadio() {
		assertEquals(circulo.obtenerRadio(), 3);		
	}
	
	@Test
	void testDiametro() {
		assertEquals(circulo.diametro(), 6);		
	}
	
	@Test
	void testPerimetro() {
		assertEquals(circulo.perimetro(), Math.PI*3);		
	}
	
	@Test
	void testArea() {
		assertEquals(circulo.area(), Math.PI*(3*3));		
	}


}

//•radio
//diametro
//perimetro
//area
