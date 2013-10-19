package composite.arbol;

public class NodoCompuesto extends NodoComponente {
	private java.util.List<NodoComponente> lista;

	protected NodoCompuesto(String nombre) {
		super(nombre);
		this.lista = new java.util.ArrayList<NodoComponente>();
	}

	@Override
	public void remove(NodoComponente cc) {
		lista.remove(cc);

	}

	@Override
	public void add(NodoComponente cc) {
		if (cc != null)
			lista.add(cc);

	}

	@Override
	public int suma() {
		int total = 0;
		for (NodoComponente item : lista) {
			total += item.suma();
		}
		return total;
	}

	@Override
	public int mayor() {
		// TODO Auto-generated method stub
		int mayor = 0;
		for (NodoComponente item : lista) {
			if (item.mayor() > mayor)
				mayor = item.mayor();
		}
		return mayor;
	}

}
