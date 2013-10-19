package composite.arbol;


public abstract class NodoComponente {
	private String nombre;
	protected int valor;

	public int getValor() {
		return this.valor;
	}

	
	protected NodoComponente(String nombre) {
		this.nombre = nombre;
	}
	
	protected NodoComponente(int valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public abstract void remove(NodoComponente cc);

	public abstract void add(NodoComponente cc);
	
	public abstract int suma();
		
	public abstract int mayor();
	
}
