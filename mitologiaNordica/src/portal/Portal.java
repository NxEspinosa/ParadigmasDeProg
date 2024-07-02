package portal;

public class Portal {
	private boolean abierto = false;
	
	public boolean estaAbierto() {
		return abierto;
	}

	public void setAbrir(boolean abrir) {
		if (!this.abierto)
			this.abierto = abrir;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}


	
}
