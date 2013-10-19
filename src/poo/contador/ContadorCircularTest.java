package poo.contador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContadorCircularTest {
	private ContadorCircular cc1, cc2, cc3;

	@Before
	public void setUp() throws Exception {
		cc1 = new ContadorCircular();
		cc2 = new ContadorCircular(5);
		cc3 = new ContadorCircular(2);
		assertEquals("El valor de contador inicial debe ser 0", 0,
				cc2.getContador());
	}

	@Test
	public void testGetMax() {
		assertEquals("El valor máximo inicial debe ser 10", 10, cc1.getMax());
		assertEquals("El valor máximo no se lee correctamente", 5, cc2.getMax());
	}

	@Test
	public void testGetContador() {
		assertEquals("El valor de contador inicial debe ser 0", 0,
				cc1.getContador());
	}

	@Test
	public void testIncrementar() {
		for (int i = 0; i < 6; i++) {
			cc2.incrementar();
		}
		assertEquals("El valor de contador debe ser 0", 0, cc2.getContador());
		for (int i = 0; i < 4; i++) {
			cc3.incrementar();
		}
		assertEquals("El valor de contador debe ser 1", 1, cc3.getContador());
	}

	@Test
	public void testReset() {
		cc3.incrementar();
		cc3.reset();
		assertEquals("El valor de contador debe ser 0", 0, cc3.getContador());
	}
}
