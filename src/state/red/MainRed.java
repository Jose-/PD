package state.red;

import upm.jbb.IO;

public class MainRed {
    private Conexion connection = new Conexion();

    public MainRed() {
        this.connection.setEmisor(new EmisorMock());
    }

    public void abrir() {
        this.connection.abrir();
    }

    public void parar() {
        this.connection.parar();
    }

    public void iniciar() {
        this.connection.iniciar();
    }

    public void enviar() {
        this.connection.enviar();
    }

    public void cerrar() {
        this.connection.cerrar();
    }

    public static void main(String[] args) {
        IO.in.addController(new MainRed());
    }

}
