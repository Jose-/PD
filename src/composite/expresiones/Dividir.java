package composite.expresiones;

public class Dividir extends Expresion {

	
	public Dividir(Expresion val1, Expresion val2) {
		super(val1, val2);
		this.valor = operar();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return (this.val1.valor / this.val2.valor);
	}

}
