package poo.biblioteca;

public abstract class Ciudadano {
	/**
	 * @uml.property  name="dni"
	 */
	protected String dni;
	/**
	 * @uml.property  name="nombre"
	 */
	protected String nombre;
	/**
	 * @uml.property  name="apellido"
	 */
	protected String apellido;

	public Ciudadano(String dni, String nombre, String apellido) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/**
	 * @return
	 * @uml.property  name="dni"
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni
	 * @uml.property  name="dni"
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return
	 * @uml.property  name="nombre"
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 * @uml.property  name="nombre"
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 * @uml.property  name="apellido"
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 * @uml.property  name="apellido"
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
