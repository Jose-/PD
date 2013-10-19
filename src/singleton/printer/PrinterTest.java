package singleton.printer;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterTest {
	@Test
	public void esSingleton() {
		assertSame("Factory no es singleton",
				PrinterFactory.getPrinterFactory(),
				PrinterFactory.getPrinterFactory());
	}

	@Test
	public void esFactoria() {
		PrinterAMock pam = new PrinterAMock();
		PrinterBMock pbm = new PrinterBMock();
		PrinterFactory.getPrinterFactory().setPrinter(pam);
		assertSame("Esperado PrinterA", pam, PrinterFactory.getPrinterFactory()
				.getPrinter());
		assertSame("Esperado PrinterA", pam, PrinterFactory.getPrinterFactory()
				.getPrinter());
		PrinterFactory.getPrinterFactory().setPrinter(pbm);
		assertSame("Esperado PrinterB", pbm, PrinterFactory.getPrinterFactory()
				.getPrinter());
	}
}