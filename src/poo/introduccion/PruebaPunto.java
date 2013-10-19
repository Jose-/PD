package poo.introduccion;

import upm.jbb.IO;

public class PruebaPunto {
	public void prueba() {
		Punto pt1, pt2;
		pt1 = new Punto(2, 2);
		pt2 = new Punto();
		IO.out.println("pt1: " + pt1.toString());
		IO.out.println("pt1: " + pt1.getPtX() + "," + pt1.getPtY());
		IO.out.println("pt2: " + pt2.toString());
		pt2.setPtX(6);
		pt2.setPtY(7);
		IO.out.println("pt2: " + pt2.toString());
		IO.out.println("Modulo pt1: " + pt1.modulo());
		IO.out.println("Fase pt1: " + pt1.fase() + "º");
	}

	public static void main(final String[] args) {
		new PruebaPunto().prueba();
	}
}
