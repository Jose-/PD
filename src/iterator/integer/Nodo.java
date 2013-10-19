package iterator.integer;

import iterator.ejemplo.Iterador1;


import java.util.Iterator;


public class Nodo implements Iterable<Integer>{

	private int valor;
	private Integer siguiente;

	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;
	}

	public void add(Integer subNodo) {
		this.siguiente = subNodo;
	}

	public Integer getSiguiente() {
		return this.siguiente;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
