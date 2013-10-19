package command.calculadora;

import upm.jbb.IO;

public class ComandoRestar extends Comando {

	public ComandoRestar(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.calc.restar(IO.in.readInt());
	}

}
