package poo.alquiler;



public class Registro {
	private Vehiculo v;
	private Cliente c;
	private double horaRecogida;
	private double totalHorasFacturadas;

	public Registro(Vehiculo v, Cliente c, double horaRecogida,
			double totalHorasFacturadas) {

		this.v = v;
		this.c = c;
		this.horaRecogida = horaRecogida;
		this.totalHorasFacturadas = totalHorasFacturadas;
	}

	public double getTotalHorasFacturadas() {
		return totalHorasFacturadas;
	}

	public double totalFactura() {

		return (v.precioHora * this.totalHorasFacturadas);
	}

}
