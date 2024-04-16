package unlam.paradigmas.objetos.ej02;

public class Punto {
	private int x, y;

	public int obtenertX() {
		return x;
	}

	public void cambiarX(int x) {
		this.x = x;
	}

	public int obtenerY() {
		return y;
	}

	public void cambiarY(int y) {
		this.y = y;
	}
	
	//1.obtener y cambiar cada una de sus coordenadas: `java public double obtenerX() public double obtenerY() public void cambiarX(double nuevoX) public void cambiarY(double nuevoY) `
	//2.saber si el punto está sobre el eje de las X: `java public boolean estaSobreEjeX() `
	//3.saber si el punto está sobre el eje de las Y: `java public boolean estaSobreEjeY() `
	//4.saber si el punto es el origen de coordenadas: `java public boolean esElOrigen() { } `
	//5.calcular la distancia al origen y a otro punto: `java public double distanciaAlOrigen() { } public double distanciaAotroPunto(Punto otro) { } `
	
	public boolean estaSobreElEjeX() {
		return this.y == 0;
	}
	
	public boolean estaSobreEjeY() {
		return this.x == 0;
	}
	
	public boolean esElOrigen() { 
		return this.x == 0 && this.y == 0;
	}
	
	public double distanciaAlOrigen() { 
		return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
	}
	
	public double distanciaAotroPunto(Punto otro) { 
		return Math.sqrt(Math.pow(this.x - otro.x,2) + Math.pow(this.y - otro.y,2) );
	}

}
