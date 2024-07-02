package mitologiaNordica;

import org.junit.jupiter.api.Test;

import arma.ArmaDivina;
import arma.Mjolnir;
import guerrero.GuerreroArma;
import guerrero.GuerreroPortal;
import guerrero.GuerreroRuna;
import portal.Asgard;
import runa.Ataque;

class MitologiaNordicaTest {

	@Test
	void testGuerreroPortal() {
		System.out.println();

		GuerreroPortal gp = new GuerreroPortal("Mauro");
		Asgard portalAsgard = new Asgard();
		gp.abrir(portalAsgard);
		gp.abrir(portalAsgard); //No se puede abrir dos veces el mismo portal
		
		gp.ocultarse();
		gp.ocultarse(); // No se puede oultar cuando ya se está oculto
	}
	
	@Test
	void testGuerreroArma() {
		System.out.println();
		GuerreroArma ga = new GuerreroArma("Mauro");
		GuerreroArma gaj = new GuerreroArma("Juan");
		
		ArmaDivina arma = new Mjolnir();
		ga.usarArmaDivina(arma, gaj);
		ga.usarArmaDivina(arma, ga); // no se puede atacar a si mismo

	}

	@Test
	void testGuerreroRuna() {
		System.out.println();

		GuerreroRuna ga = new GuerreroRuna("Mauro");
		
		ga.alterar(new Ataque());
	}
}
