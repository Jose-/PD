package poo.operador;

public class Operando {
	private final Object[] operandos;

	public Operando() {
		this.operandos = new Object[4];
		this.operandos[0] = new Suma(1, 1);
		this.operandos[1] = new Resta(2, 5);
		this.operandos[2] = new Resta(3, 1);
		this.operandos[3] = new Suma(1, 1);
	}

	public int total() {
		int result = 0;
		for (Object operando : this.operandos) {
			result += ((Operacion) operando).resultado();
		}
		return result;
	}

}
