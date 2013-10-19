package poo.alquiler;

public class Coche extends Vehiculo {

	public Coche(int id, String descripcion, Categoria c) {
		super(id,descripcion, c.getValue());

	}

}
