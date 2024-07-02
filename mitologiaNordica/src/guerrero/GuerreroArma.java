package guerrero;

import arma.ArmaDivina;

public class GuerreroArma extends GuerreroNordico {

	public GuerreroArma(String nombre) {
		super(nombre);
	}

	public void usarArmaDivina(ArmaDivina arma, GuerreroNordico guerrero) {
		if (guerrero != this)
			System.out.println("El guerrero " + this.getNombre() + ", especialista en armas divinas, usó "
							+ arma.getClass().getSimpleName() + " contra el guerrero " + guerrero.getNombre());
		else
			System.out.println("No se puede usar el arma contra si mismo");
	}
}
