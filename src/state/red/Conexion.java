package state.red;

public class Conexion {
	private Red red;
	private Emisor emisor;

	public Conexion() {
		this.red = new Cerrada();

	}

	public void setEmisor(Emisor emisor) {

		this.emisor = emisor;
	}

	public Emisor getEmisor() {

		return this.emisor;
	}

	public Estado estado() {
		return this.red.estado();
	}

	public Red getRed() {
		return this.red;
	}

	public void setRed(Red red) {
		this.red = red;
	}

	public void abrir() {
		red.abrir(this);
	}

	public void cerrar() {
		red.cerrar(this);
	}

	public void parar() {
		red.parar(this);
	}

	public void iniciar() {
		red.iniciar(this);
	}

	public void enviar() {
		red.enviar(this);
	}

	@Override
	public String toString() {
		return "Context[" + red + "]";
	}

}
