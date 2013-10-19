package state.red;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConexionTest {
    private Conexion conexion;
    

    private EmisorMock emisor;

    @Before
    public void ini() {
        this.conexion = new Conexion();
        assertEquals("Estado inicial incorrecto", Estado.CERRADO, this.conexion.estado());
        this.emisor = new EmisorMock();
        //Se inyecta el emisor en la conexion
        this.conexion.setEmisor(emisor);
    }

    @Test
    public void pruebaEstados() {
        this.cerrado();
    }

    private void cerrado() {
        this.conexion.cerrar();
        assertEquals("Estado debe ser CERRADO", Estado.CERRADO, this.conexion.estado());
        try {
            this.conexion.enviar();
            fail("No ha saltado una excepcion: CERRADO:enviar");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
        try {
            this.conexion.parar();
            fail("No ha saltado una excepcion: CERRADO:parar");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
        try {
            this.conexion.iniciar();
            fail("No ha saltado una excepcion: CERRADO:iniciar");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
        this.conexion.abrir();
        assertEquals("Estado debe ser PREPARADO", Estado.PREPARADO, this.conexion.estado());
        this.preparado();
    }

    private void preparado() {
        this.conexion.abrir();
        assertEquals("Estado debe ser PREPARADO", Estado.PREPARADO, this.conexion.estado());
        int ref = emisor.getRef();
        this.conexion.enviar();
        assertEquals("No se ha enviado", ref + 1, emisor.getRef());
        assertEquals("Estado debe ser PREPARADO", Estado.PREPARADO, this.conexion.estado());
        this.conexion.cerrar();
        assertEquals("Estado debe ser CERRADO", Estado.CERRADO, this.conexion.estado());
        this.conexion.abrir();
        this.conexion.parar();
        assertEquals("Estado debe ser PARADO", Estado.PARADO, this.conexion.estado());
        this.parado();
    }

    private void parado() {
        try {
            this.conexion.enviar();
            fail("No ha saltado una excepcion: PARADO:enviar");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
        try {
            this.conexion.cerrar();
            fail("No ha saltado una excepcion: PARADO:cerrar");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
        try {
            this.conexion.abrir();
            fail("No ha saltado una excepcion: PARADO:abrir");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
        this.conexion.parar();
        assertEquals("Estado debe ser PARADO", Estado.PARADO, this.conexion.estado());
        this.conexion.iniciar();
        assertEquals("Estado debe ser PREPARADO", Estado.PREPARADO, this.conexion.estado());
    }

}
