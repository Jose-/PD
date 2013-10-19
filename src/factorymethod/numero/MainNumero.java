package factorymethod.numero;

import upm.jbb.IO;

public class MainNumero {
	private CreadorNumero[] creadores = { new CreadorNumeroEN(),
			new CreadorNumeroES() };
	private CreadorNumero creador = creadores[0];

	public void tipoCreador() {
		this.creador = (CreadorNumero) IO.in.select(creadores, "Tipo creador");
	}

	public void crearNumero() {
		Numero num = creador.createNumero();
		IO.out.println(num.convertir(IO.in.readInt("Numero")));
	}

	public static void main(String[] args) {
		IO.in.addController(new MainNumero());
	}
}
