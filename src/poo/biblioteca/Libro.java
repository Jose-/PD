package poo.biblioteca;

public class Libro {
	/**
	 * @uml.property  name="isbn"
	 */
	private String isbn;
	/**
	 * @uml.property  name="titulo"
	 */
	private String titulo;
	/**
	 * @uml.property  name="autor"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Autor autor;
	/**
	 * @uml.property  name="prestado"
	 */
	private boolean prestado = false;

	public Libro(String isbn, String titulo, Autor autor) {

		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	
	/**
	 * @return
	 * @uml.property  name="titulo"
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo
	 * @uml.property  name="titulo"
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return
	 * @uml.property  name="prestado"
	 */
	public boolean isPrestado() {
		return prestado;
	}

	/**
	 * @param prestado
	 * @uml.property  name="prestado"
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor="
				+ autor + ", prestado=" + prestado + "]";
	}
	
	

}
