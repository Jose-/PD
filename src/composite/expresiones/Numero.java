package composite.expresiones;

public class Numero extends Expresion {

	protected Numero(int valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return this.valor;
	}

}
