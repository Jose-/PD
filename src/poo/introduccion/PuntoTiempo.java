package poo.introduccion;

public class PuntoTiempo extends Punto {
	private int tmp;

	public PuntoTiempo(final int ptX, final int ptY, final int tmp) {
		super(ptX, ptY); // Debe ser la 1ª sentencia, si no se especifica es:
							// super();
		this.setTmp(tmp);
	}

	public PuntoTiempo() {
		this(0, 0, 0);
	}

	public int getTmp() {
		return this.tmp;
	}

	public final void setTmp(final int tmp) {
		this.tmp = tmp;
	}

	public double velocidad() {
		return this.modulo() / this.getTmp();
	}
}
