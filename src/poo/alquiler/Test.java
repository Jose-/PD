package poo.alquiler;

import java.util.ArrayList;

import upm.jbb.IO;

public class Test {

	public void prueba() {
		GestorRegistro g;

		ArrayList<Vehiculo> vehiculos = new ArrayList<>();

		vehiculos.add(new Moto(1, "Moto 1"));
		vehiculos.add(new Coche(2, "Coche 1", Categoria.A));

		ArrayList<Cliente> clientes = new ArrayList<>();

		clientes.add(new Cliente("001", "20-09-1980"));
		clientes.add(new Cliente("002", "15-05-1980"));

		ArrayList<Registro> registros = new ArrayList<>();

		registros.add(new Registro(vehiculos.get(0), clientes.get(0), 1, 3));
		registros.add(new Registro(vehiculos.get(1), clientes.get(1), 1, 2));

		g = new GestorRegistro(registros);

		IO.out.println("Total dinero: " + g.totalDineroFacturado()
				+ "\nTotal horas: " + g.totalHorasAlquiladas());
	}

	public static void main(final String[] args) {
		new Test().prueba();
		;
	}
}