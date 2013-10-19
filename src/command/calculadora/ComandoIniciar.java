package command.calculadora;

public class ComandoIniciar extends Comando {

	public ComandoIniciar(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.calc.iniciar();;
	}

}
