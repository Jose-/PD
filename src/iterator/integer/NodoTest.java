package iterator.integer;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class NodoTest {
	@Test
	public void iterador() {
		Nodo n1, n2, raiz;
		raiz = new Nodo(0);
		n1 = new Nodo(1);
		raiz.add(n1);
		n2 = new Nodo(2);
		n1.add(n2);
		Iterator<Integer> iti = raiz.iterator();
		Integer v = 0;
		while (iti.hasNext()) {
			assertEquals("Valor incorrecto", v++, iti.next());
		}
	}
}
