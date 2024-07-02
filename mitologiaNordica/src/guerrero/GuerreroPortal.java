package guerrero;

import portal.Portal;

public class GuerreroPortal extends GuerreroNordico {	
	
	public GuerreroPortal(String nombre) {
		super(nombre);
	}
	
	public void abrir(Portal portal) {
		if(!portal.estaAbierto()) {
			portal.setAbrir(true);
			System.out.println("El guerrero " + this.getNombre() + ", especialista en portales, abrio un portal a " + portal);
		} else 
			System.out.println("El portal ya se encuentra abierto");
	}
	
}
