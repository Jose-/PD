package poo.alquiler;

import java.util.ArrayList;

public class GestorRegistro {

	ArrayList<Registro> registros;

	public GestorRegistro(ArrayList<Registro> registros) {
		this.registros = registros;
	}

	public double totalHorasAlquiladas() {
		double result = 0;
		for (Registro registro : this.registros) {
			result += registro.getTotalHorasFacturadas();
		}
		return result;
	}

	public double totalDineroFacturado() {
		double result = 0;
		for (Registro registro : this.registros) {
			result += registro.totalFactura();
		}
		return result;
	}

}
