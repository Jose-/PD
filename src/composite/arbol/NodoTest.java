package composite.arbol;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodoTest {
	private NodoComponente raiz;
	private NodoComponente inter;

	@Before
	public void ini() {
		this.raiz = new NodoCompuesto("raiz");
		this.raiz.add(null);
		this.raiz.add(new NodoHoja(1));
		this.inter = new NodoCompuesto("sub");
		this.inter.add(new NodoHoja(4));
		this.inter.add(new NodoHoja(3));
		this.inter.add(new NodoHoja(2));
		NodoComponente no = new NodoHoja(-1);
		this.inter.add(no);
		this.inter.remove(no);
		this.raiz.add(this.inter);
		this.raiz.add(new NodoHoja(5));
	}

	@Test
	public void suma() {
		assertEquals("Suma incorrecta", 15, this.raiz.suma());
	}

	@Test
	public void mayor() {
		assertEquals("Mayor incorrecto: raiz", 5, this.raiz.mayor());
		assertEquals("Mayor incorrecto: intermedio", 4, this.inter.mayor());
	}

	@Test
	public void exepciones() {
		NodoComponente excp = new NodoHoja(0);
		try {
			excp.add(new NodoHoja(2));
			fail("No ha saltado la excepción al añadir a una hoja");
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void nulls() {
		this.raiz.add(null);
		this.raiz.remove(null);
	}
}
