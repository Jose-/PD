package poo.introduccion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumaTest {
	private Suma suma;

	@Before
	public void paraEjecutarAntes() {
		suma = new Suma();
	}

	@Test
	public void aVerSiIncrementaBien() {
		assertEquals("Test incrementa", 2.0, suma.incrementa(1.0), 1e-6);
	}

	@Test
	public void aVerSiSumaBien() {
		assertEquals("Test suma", 2.0, suma.getSuma(1.0, 1.0), 1e-6);
	}

	@After
	public void paraEjecutarDespues() {
		// Fin de test. Liberar recursos o borrar rastros del test
	}
}
