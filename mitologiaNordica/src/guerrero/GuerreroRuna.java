package guerrero;

import runa.Runa;

public class GuerreroRuna extends GuerreroNordico {
	
	public GuerreroRuna(String nombre) {
		super(nombre);
	}

	public void alterar(Runa runa) {
		System.out.println("El guerrero, " + this.getNombre() + 
				" especialista en runas, altero el funcionamiento de una runa de " + runa.getClass().getSimpleName() );
	}

}
