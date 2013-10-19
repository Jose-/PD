package poo.operador;

public abstract class Operacion {
	protected double val1;
	protected double val2;

	public abstract double resultado();

	public abstract double resultado(double val1, double val2);
}