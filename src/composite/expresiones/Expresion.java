package composite.expresiones;

public abstract class Expresion {
	protected Expresion val1;
	protected Expresion val2;
	protected int valor;

	protected Expresion(int valor) {
		this.valor = valor;
	}

	protected Expresion(Expresion val1, Expresion val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public abstract int operar();
}
