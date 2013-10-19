package poo.contador;

/**
 * @author jbernal @version 1.0 01/09/2012
 *         <p>
 *         Representa un contador similar a un cuenta kilómetros de un coche con
 *         un valor de cuenta máximo. El valor máximo sólo se puede establecer
 *         en el constructor. Con cada mensaje incrementar(), se incrementa en
 *         uno el contador y al sobrepasar el valor máximo vuelve a cero.
 *         </p>
 */
public class ContadorCircular {
	/**
	 * Se inicializa con contador a 0
	 * 
	 * @param max
	 *            representa el valor máximo de cuenta
	 */
	private int max;
	private int cont;

	public ContadorCircular(int max) {
		this.max = max;
	}

	/** Se inicializa con valor máximo de contador a 10 y contador a 0 */
	public ContadorCircular() {
		this.max = 10;
		this.cont = 0;
	}

	/** @return el máximo valor del contador */
	public int getMax() {
		return this.max;
	}

	/** @return el valor del contador */
	public int getContador() {
		return this.cont;
	}

	/** incrementa en uno el contador, si sobrepasa el máximo se pone a cero */
	public void incrementar() {
		if (this.cont < this.max)
			this.cont++;
		else
			this.cont = 0;
	}

	/** Se pone el valor de contador a cero */
	public void reset() {
		this.cont = 0;
	}
}