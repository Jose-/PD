package state.red;

public abstract class Red {
	public abstract void abrir(Conexion conexion);
	public abstract void cerrar(Conexion conexion);
	public abstract void parar(Conexion conexion);
	public abstract void iniciar(Conexion conexion);
	public abstract void enviar(Conexion conexion);
	public abstract Estado estado();
	
}
