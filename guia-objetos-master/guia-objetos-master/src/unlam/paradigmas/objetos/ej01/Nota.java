package unlam.paradigmas.objetos.ej01;

public class Nota {
	
	private int nota;
	
    public int obtenertNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

    public Nota(int valorInicial) {
    	if (valorInicial > 0 && valorInicial <= 10) 
    		this.setNota(valorInicial);
    	else
    		System.out.println("Error la nota debe estar comprendida entre cero y 10");
    }
    

    public boolean aprobado() {
    	return this.nota >= 4;
    }
    
    public boolean desaprobado() {
    	return this.nota < 4;
    }

    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     *       por nuevoValor, siempre y cuando nuevoValor sea superior al
     *       valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor) {
    	if (nuevoValor > 0 && nuevoValor  <= 10 && nuevoValor > this.nota) 
    		this.nota = nuevoValor;

    	else
    		System.out.println("Error la nota debe estar comprendida entre cero y 10");
    }

}
