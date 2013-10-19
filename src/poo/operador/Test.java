package poo.operador;

import upm.jbb.IO;

public class Test {

	public void prueba() {
		Operando p = new Operando();

		IO.out.println("Total : "+p.total());
	}

	public static void main(final String[] args) {
		new Test().prueba();
		;
	}
}