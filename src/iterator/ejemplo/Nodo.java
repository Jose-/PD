package iterator.ejemplo;

import java.util.Iterator;

public class Nodo implements Iterable<Nodo> {
	private int valor;
	private Nodo siguiente;

	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;
	}

	public boolean isUltimo() {
		return this.siguiente == null;
	}

	public int getValor() {
		return this.valor;
	}

	public Nodo getSiguiente() {
		return this.siguiente;
	}

	public void add(Nodo subNodo) {
		this.siguiente = subNodo;
	}

	@Override
	public Iterator<Nodo> iterator() {
		return new Iterador1(this);
	}
}
