package poo.contador;

/**
 * @author jbernal @version 1.0 01/09/2012
 *         <p>
 *         Representa un contador similar a un cuenta kil�metros de un coche con
 *         un valor de cuenta m�ximo. El valor m�ximo s�lo se puede establecer
 *         en el constructor. Con cada mensaje incrementar(), se incrementa en
 *         uno el contador y al sobrepasar el valor m�ximo vuelve a cero.
 *         </p>
 */
public class ContadorCircular {
	/**
	 * Se inicializa con contador a 0
	 * 
	 * @param max
	 *            representa el valor m�ximo de cuenta
	 */
	private int max;
	private int cont;

	public ContadorCircular(int max) {
		this.max = max;
	}

	/** Se inicializa con valor m�ximo de contador a 10 y contador a 0 */
	public ContadorCircular() {
		this.max = 10;
		this.cont = 0;
	}

	/** @return el m�ximo valor del contador */
	public int getMax() {
		return this.max;
	}

	/** @return el valor del contador */
	public int getContador() {
		return this.cont;
	}

	/** incrementa en uno el contador, si sobrepasa el m�ximo se pone a cero */
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