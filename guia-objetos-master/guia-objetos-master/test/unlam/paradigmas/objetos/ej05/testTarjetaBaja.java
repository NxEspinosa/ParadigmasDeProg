package unlam.paradigmas.objetos.ej05;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testTarjetaBaja {

	TarjetaBaja tarjeta = new TarjetaBaja(1000);
	
	@Test
	void testobtenerSaldo() {
		assertEquals(tarjeta.obtenerSaldo(), 1000);
	}
	
	@Test
	void testcargar() {
		tarjeta.cargar(500);
		assertEquals(tarjeta.obtenerSaldo(), 1500);
	}
	
	@Test
	void testpagarViajeEnColectivo() {
		
		tarjeta.pagarViajeEnColectivo();

		assertEquals(tarjeta.obtenerSaldo(), 960.41);		
	}
	
	
	@Test
	void testpagarViajeEnSubte() {
		
		tarjeta.pagarViajeEnSubte();

		assertEquals(tarjeta.obtenerSaldo(), 965.50);		
	}
	
	@Test
	void testcontarViajes() {
		
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();

		assertEquals(tarjeta.contarViajes(), 3);
	}
	
	@Test
	void testcontarViajesEnColectivo() {
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnSubte();

		assertEquals(tarjeta.contarViajesEnColectivo(), 3);
	}
	
	@Test
	void testcontarViajesEnSubte() {
		
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnSubte();		
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();


		assertEquals(tarjeta.contarViajesEnSubte(), 6);
	}

}
