package command.calculadora;

import upm.jbb.IO;

public class Calculadora {
	private int total;

	public Calculadora() {
		this.total = 0;
	}

	public int getTotal() {
		IO.out.println("getTotal..." + this.total);
		return total;
	}

	protected void setTotal(int total) {
		this.total = total;
	}

	public void sumar(int valor) {
		this.total += valor;
		IO.out.println("sumar..." + valor + "-->" + this.total);
	}

	public void restar(int valor) {
		this.total -= valor;
		IO.out.println("restar..." + valor + "-->" + this.total);
	}

	public void iniciar() {
		this.total = 0;
		IO.out.println("iniciar..." + this.total);
	}
}
