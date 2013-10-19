package factorymethod.numero;

public class CreadorNumeroEN extends CreadorNumero {

	public CreadorNumeroEN() {
		this.texto = new String[] { "zero", "one", "two", "tree", "four",
				"five" };
	}

	@Override
	public Numero createNumero() {
		// TODO Auto-generated method stub
		return new CreadorNumeroEN();
	}

}