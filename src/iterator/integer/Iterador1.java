package iterator.integer;

import iterator.ejemplo.Nodo;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterador1 implements Iterator<Nodo> {
	private Nodo actual;

	public Iterador1(Nodo actual) {
		this.actual = actual;
	}

	@Override
	public boolean hasNext() {
		return this.actual != null;
	}

	@Override
	public Nodo next() {
		if (!this.hasNext()) {
			throw new NoSuchElementException();
		}
		Nodo ant = this.actual;
		this.actual = this.actual.getSiguiente();
		return ant;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
