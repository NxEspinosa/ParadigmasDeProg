package edu.unlam.oop;

public class App {
	
	public static void main(String[] args) {
		Persona lucas = new Persona("Lucas", 18);
		
		lucas.esMayorDeEdad();
		
		System.out.println(lucas.presentarse());
		System.out.println(lucas.esMayorDeEdad());
		
		
		
	}
}
