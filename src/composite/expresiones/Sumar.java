package composite.expresiones;

public class Sumar extends Expresion {

	protected Sumar(Expresion val1, Expresion val2) {
		// TODO Auto-generated constructor stub
		super(val1, val2);
		this.valor = operar();
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return (this.val1.valor + this.val2.valor);
	}

}
