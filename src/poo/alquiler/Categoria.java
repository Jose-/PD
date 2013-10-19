package poo.alquiler;

public enum Categoria {
	A(18), B(14), C(10);

	private final int value;

	private Categoria(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
