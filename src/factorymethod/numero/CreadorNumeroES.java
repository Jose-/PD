package factorymethod.numero;

public class CreadorNumeroES extends CreadorNumero {

	public CreadorNumeroES() {
		this.texto = new String[] { "cero", "uno", "dos", "tres", "cuatro",
				"cinco" };
	}

	@Override
	public Numero createNumero() {
		// TODO Auto-generated method stub
		return new CreadorNumeroES();
	}
}
