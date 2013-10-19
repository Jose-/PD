package poo.registrador;

public class Receptor {
	private Registrador registrador;

	public Receptor(final Registrador registrador) {
		this.registrador = registrador;
	}

	public void aviso(final String msg) {
		this.registrador.registrar(msg);
	}
}
