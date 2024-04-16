package edu.unlam.matematica;

import java.util.Objects;

public class Vector {
	
	int x, y, z;
	
	public Vector(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector sumarVectores(Vector vector) {
		return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
	}
	
	public Vector multiplicarVectorPorEscalar(int escalar) {
		return new Vector(this.x * escalar, this.y * escalar, this.z * escalar);
	}
	
	public void imprimirVector() {
		System.out.println(x + " " + y + " " + z);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y, z);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector other = (Vector) obj;
		return x == other.x && y == other.y && z == other.z;
	}
	
	
}
