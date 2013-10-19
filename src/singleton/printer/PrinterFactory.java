package singleton.printer;

public class PrinterFactory {
	private Printer printer = null;
	private static PrinterFactory printerFactory = new PrinterFactory();

	public static PrinterFactory getPrinterFactory()
	{
		return printerFactory;
	}
	
	public Printer getPrinter() {
		return this.printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
}