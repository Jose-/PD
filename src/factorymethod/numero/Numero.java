package factorymethod.numero;

public abstract class Numero {
	 protected String[] texto;

	public String convertir(int numero) {

		if (0 <= numero && numero <= 5) {
			return texto[numero];
		} else {
			return "???";
		}
	}
}
