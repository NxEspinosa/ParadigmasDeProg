package unlam.paradigmas.objetos.ej03;

public class Circulo {
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double obtenerRadio() {
		return radio;
	}
	
	public double diametro() {
		return radio * 2;
	}
	
	public double perimetro() {
		return Math.PI * radio;
	}
	
	public double area() {
		return Math.PI * Math.pow(radio,2);
	}
}
