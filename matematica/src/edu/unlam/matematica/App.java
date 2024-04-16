package edu.unlam.matematica;

public class App {
	public static void main(String[] args) {
		Vector vectorA = new Vector(1, 2, 3);
		Vector vectorB = new Vector(5, 2, 1);
		
		Vector resultado = vectorA.sumarVectores(vectorB);
		
		Vector resultadoMultiplicacion = vectorA.multiplicarVectorPorEscalar(4);

		resultado.imprimirVector();
		
		resultadoMultiplicacion.imprimirVector();
		
		resultadoMultiplicacion = vectorB.multiplicarVectorPorEscalar(4);
		
		resultadoMultiplicacion.imprimirVector();


	}
}
