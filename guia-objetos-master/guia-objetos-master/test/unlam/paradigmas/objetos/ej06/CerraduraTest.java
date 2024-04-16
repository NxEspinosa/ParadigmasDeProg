package unlam.paradigmas.objetos.ej06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CerraduraTest {
	
	Cerradura cerradura = new Cerradura(1234, 3);

	@Test
	void testAbrir() {
		cerradura.abrir(1234);
		
		assertTrue(cerradura.estaAbierta());
	}
	
	void testAbrir2() {
		cerradura.abrir(12334);
		cerradura.abrir(12334);

		assertFalse(cerradura.estaAbierta());
	}
	
	void testAbrir3() {
		cerradura.abrir(1234);
		cerradura.cerrar();

		assertFalse(cerradura.estaAbierta());
	}
	
	void testAbrir4() {
		cerradura.abrir(1111);
		cerradura.abrir(1111);
		cerradura.abrir(1111);
		cerradura.abrir(1111);
		cerradura.abrir(1234);


		assertFalse(cerradura.estaAbierta());
	}
	
	
	
	@Test
	void testBloquear() {
		
		cerradura.abrir(1235);
		cerradura.abrir(1235);
		cerradura.abrir(1233);
		cerradura.abrir(1231);
		
		assertTrue(cerradura.fueBloqueada());
	}

	@Test
	void testCerrar() {
		
		cerradura.cerrar();
		cerradura.abrir(1234);
		cerradura.cerrar();
		
		assertTrue(cerradura.estaCerrada());
	}
	
	@Test
	void testCerrar2() {
		
		cerradura.cerrar();
		cerradura.abrir(1234);
		cerradura.cerrar();
		cerradura.abrir(1234);

		assertFalse(cerradura.estaCerrada());
	}
	
	@Test
	void testCerrar3() {
		
		cerradura.abrir(1254);

		assertTrue(cerradura.estaCerrada());
	}
	
	@Test
	void testCerrar4() {
		
		cerradura.abrir(1234);
		cerradura.cerrar();
		cerradura.abrir(1233);


		assertTrue(cerradura.estaCerrada());
	}
	
	@Test
	void testcontarAperturasExitosas() {
		cerradura.abrir(1224);
		System.out.println(cerradura.contarAperturasExitosas());
		cerradura.abrir(1234);
		System.out.println(cerradura.contarAperturasExitosas());
		cerradura.abrir(1234);
		System.out.println(cerradura.contarAperturasExitosas());
		cerradura.abrir(1224);
		System.out.println(cerradura.contarAperturasExitosas());
		cerradura.abrir(1234);
		System.out.println(cerradura.contarAperturasExitosas());

		
		cerradura.abrir(1234);
		System.out.println(cerradura.contarAperturasExitosas());
		cerradura.abrir(1224);
		System.out.println(cerradura.contarAperturasExitosas());
		cerradura.abrir(1234);
		System.out.println(cerradura.contarAperturasExitosas());

		

		assertEquals(cerradura.contarAperturasExitosas(), 5);
	}
	
	
	@Test
	void testcontarAperturasExitosas2() {
		cerradura.abrir(1224);
		cerradura.abrir(1234);
		cerradura.abrir(1234);
		cerradura.abrir(1224);
		cerradura.abrir(1234);
		
		cerradura.abrir(1234);
		cerradura.abrir(1224);
		cerradura.abrir(1234);

		

		assertEquals(cerradura.contarAperturasExitosas(), 5);
	}
	
	@Test
	void testcontarAperturasFallidas() {
		cerradura.abrir(1224);
		cerradura.abrir(1111);	

		assertEquals(cerradura.contarAperturasFallidas(), 2);
	}
	
	
	
}
