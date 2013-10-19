package factorymethod.numero;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroTest {
	private CreadorNumero creadorEn = new CreadorNumeroEN();
	private CreadorNumero creadorEs = new CreadorNumeroES();

	@Test
	public void crear() {
		Numero num = creadorEn.createNumero();
		assertNotSame("Debe ser new", creadorEn.createNumero(), num);
	}

	@Test
	public void convertir() {
		assertEquals("No convierte el 0 a ES", "cero", this.creadorEs
				.createNumero().convertir(0).toLowerCase());
		assertEquals("No convierte el 5 a ES", "cinco", this.creadorEs
				.createNumero().convertir(5).toLowerCase());
		assertEquals("No convierte el 0 a EN", "zero", this.creadorEn
				.createNumero().convertir(0).toLowerCase());
		assertEquals("No convierte el 5 a EN", "five", this.creadorEn
				.createNumero().convertir(5).toLowerCase());
	}
}
