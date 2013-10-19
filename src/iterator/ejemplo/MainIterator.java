package iterator.ejemplo;

import java.util.Iterator;

import upm.jbb.IO;

public class MainIterator {
	private Nodo raiz = null, actual = null;

	public void addNodo() {
		Nodo aux = new Nodo(IO.in.readInt("Valor del nodo"));
		if (this.raiz == null) {
			this.raiz = aux;
		} else {
			this.actual.add(aux);
		}
		this.actual = aux;
	}

	public void view() {
		if (this.raiz == null) {
			IO.out.println("null");
			return;
		}
		Iterator<Nodo> i = this.raiz.iterator();
		while (i.hasNext()) {
			IO.out.print(i.next().getValor() + ", ");
		}
		IO.out.println();
	}

	public static void main(String[] args) {
		IO.in.addController(new MainIterator());
	}
}
