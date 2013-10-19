package command.calculadora;

public class ComandoImprimir extends Comando{

	public ComandoImprimir(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.calc.getTotal();
	}

}
