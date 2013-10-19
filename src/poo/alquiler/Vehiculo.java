package poo.alquiler;

public abstract class Vehiculo {
	protected String descripcion;	
	protected int id;
	protected double precioHora;

	public Vehiculo(int id,String descripcion, double precioHora) {
		this.id = id;
		this.descripcion = descripcion;		
		this.precioHora = precioHora;
	}

}
