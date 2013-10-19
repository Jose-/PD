package poo.operador;

public class Resta extends Operacion {

	public Resta(final int val1, final int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	@Override
	public double resultado() {
		// TODO Auto-generated method stub
		return (this.val1 - this.val2);
	}

	@Override
	public double resultado(double val1, double val2) {
		// TODO Auto-generated method stub
		return (val1 - val2);
	}

}
