package state.red;

public class Cerrada extends Red{

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
		conexion.setRed(new Preparada());
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
		conexion.setRed(new Cerrada());
		
	}

	@Override
	public void parar(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void enviar(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	@Override
	public Estado estado() {
		// TODO Auto-generated method stub
		return Estado.CERRADO;
	}

}
