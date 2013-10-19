package poo.biblioteca;

import java.util.Date;

public class Prestamo {
	/**
	 * @uml.property  name="libro"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Libro libro;
	/**
	 * @uml.property  name="usuario"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Usuario usuario;
	/**
	 * @uml.property  name="fechaInicio"
	 */
	private Date fechaInicio;
	/**
	 * @uml.property  name="fechaFin"
	 */
	private Date fechaFin;

	public Prestamo(Libro libro, Usuario usuario, Date fechaInicio,
			Date fechaFin) {
		
		this.libro = libro;
		this.usuario = usuario;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

}
