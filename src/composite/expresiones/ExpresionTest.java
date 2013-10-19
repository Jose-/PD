package composite.expresiones;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpresionTest {
	@Test
	public void simple() {
		Expresion exp1 = new Numero(1);
		assertEquals("Expresión de un solo valor: 1", 1, exp1.operar());
	}

	@Test
	public void suma() {
		Expresion exp1 = new Sumar(new Numero(3), new Numero(2));
		assertEquals("Expresión de suma: 3+2", 5, exp1.operar());
	}

	@Test
	public void resta() {
		Expresion exp1 = new Restar(new Numero(3), new Numero(2));
		assertEquals("Expresión de resta: 3-2", 1, exp1.operar());
	}

	@Test
	public void multiplicacion() {
		Expresion exp1 = new Multiplicar(new Numero(3), new Numero(2));
		assertEquals("Expresión de multiplicar: 3*2", 6, exp1.operar());
	}

	@Test
	public void division() {
		Expresion exp1 = new Dividir(new Numero(4), new Numero(2));
		assertEquals("Expresión de dividir: 4/2", 2, exp1.operar());
	}

	@Test
	public void compuesto() {
		Expresion exp1 = new Dividir(new Numero(4), new Numero(2)); // 2
		Expresion exp2 = new Multiplicar(exp1, new Numero(3)); // 6
		Expresion exp3 = new Restar(new Numero(3), exp2); // -3
		Expresion exp4 = new Sumar(exp3, new Numero(4)); // 1
		assertEquals("Expresión: (3-((4/2)*3))+4", 1, exp4.operar());
	}
}
