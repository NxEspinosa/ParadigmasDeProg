package guerrero;

public abstract class GuerreroNordico {
	private String nombre;
	private boolean oculto;
	
	public GuerreroNordico(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void ocultarse() {
		if (!oculto) {
			oculto = true;
			System.out.println("El guerrero " + getNombre() +" se ha ocultado");
		}
		else {
			System.out.println("El guerrero ya se encuentra oculto");
		}			
	}

}
