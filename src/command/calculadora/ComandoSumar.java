package command.calculadora;

import upm.jbb.IO;

public class ComandoSumar extends Comando {

	public ComandoSumar(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.calc.sumar(IO.in.readInt());
	}	
	
}
