package poo.biblioteca;

import composite.arbol.NodoComponente;


public class GestionBiblioteca {
	/**
	 * @uml.property  name="listaLibro"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="poo.biblioteca.Libro"
	 */
	private java.util.List<Libro> listaLibro;
	/**
	 * @uml.property  name="listaUsuario"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="poo.biblioteca.Usuario"
	 */
	private java.util.List<Usuario> listaUsuario;
	/**
	 * @uml.property  name="lista"
	 */
	private String lista;
	
	public void altaLibro(Libro libro)
	{
		listaLibro.add(libro);
	}
	
	public void altaUsuario(Usuario usuario)
	{
		listaUsuario.add(usuario);
	}
	
	public void bajaLibro(Libro libro)
	{
		listaLibro.remove(libro);
	}
	
	public void bajaUsuario(Usuario usuario)
	{
		listaUsuario.remove(usuario);
	}
	
	public String getLibros(){
		lista = "";
		
		for (Libro item : listaLibro) {
			lista = lista + item.getTitulo() + "\n";
		}
		
		return lista;
	}
	
	public String getUsuarios(){
		lista = "";
		
		for (Usuario item : listaUsuario) {
			lista = lista + item.getNombre() + "\n";
		}
		
		return lista;
	}
	
	public String getLibro(Libro libro){
		
		return libro.toString();
	}
	
	
}
