package composite.arbol;

public class NodoHoja extends NodoComponente {

	public NodoHoja(int i) {
		// TODO Auto-generated constructor stub
		super(i);
	}

	@Override
	public void remove(NodoComponente cc) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void add(NodoComponente cc) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public int suma() {
		// TODO Auto-generated method stub
		return this.valor;
	}

	@Override
	public int mayor() {
		// TODO Auto-generated method stub
		return this.valor;
	}

}
