package visitor.visitor2;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;

public class Visitador2Test {
	private Collection<Elemento> coleccion = new ArrayList<Elemento>();

	@Before
	public void ini() {
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoB());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoB());
	}

	@Test
	public void visitor2() {
		Visitador2 v2 = new Visitador2();
		for (Elemento elemento : coleccion) {
			elemento.aceptar(v2);
		}
		assertEquals("As incorrecta", 3, v2.getAs());
		assertEquals("Bs incorrecta", 2, v2.getBs());
	}
}
