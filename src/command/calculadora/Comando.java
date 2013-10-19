package command.calculadora;

public abstract class Comando {
	protected Calculadora calc;

	public Comando(Calculadora calc) {
		this.calc = calc;
	}

	public abstract void execute();
}
