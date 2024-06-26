package unlam.paradigmas.objetos.ej06;

class Cerradura {
	
	private int clave;
	private int cantidadDeFallos = 0;
	private boolean bloqueada = false;
	private boolean abierta = false;
	private int cantAperturas;
	private int cantAperturasFallidas = 0;

	
    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
    	this.clave = claveDeApertura;
    	this.cantidadDeFallos = cantidadDeFallosConsecutivosQueLaBloquean;
    };    
    
    public boolean abrir (int clave) {    
    	
    	if (fueBloqueada())
    		return false;
    	
    	if (this.clave != clave) {
    		cantAperturasFallidas++;
    		if (cantAperturasFallidas == cantidadDeFallos ) 
        		this.bloqueada = true;
    		return false;
    	}
    	
    	
    	cantAperturasFallidas = 0;
    	abierta = true;
    	cantAperturas++;
    	return true;
    }
    
    public void cerrar() {
    	cantAperturasFallidas = 0;
    	this.abierta = false;    	
    }
    
    public boolean estaAbierta() {
    	return this.abierta;
    }
    public boolean estaCerrada(){
    	return !this.abierta;
    }
    
    public boolean fueBloqueada() {
    	return this.bloqueada;
    }
    public int contarAperturasExitosas() {
    	return this.cantAperturas;
    }
    
    public int contarAperturasFallidas() {
    	return cantAperturasFallidas;
    }
}
