package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {

	private double saldo;
	private int cantViajesColectivo = 0;
	private int cantViajesSubte = 0;

	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
	}


	public double obtenerSaldo() {
		return this.saldo;
	}


	public void cargar(double monto) {
		this.saldo += monto;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		this.saldo -= 39.59;
		cantViajesColectivo++;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		this.saldo -= 34.50;
		cantViajesSubte++;
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return cantViajesColectivo + cantViajesSubte;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return cantViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return cantViajesSubte;
	}

}
