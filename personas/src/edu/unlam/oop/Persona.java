package edu.unlam.oop;

public class Persona {

	private int edad;
	private String nombre;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
	public String presentarse() {
		return "Hola, me llamo " + this.nombre;
	}
	
	
}
