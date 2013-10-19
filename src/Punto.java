public class Punto {
	private int ptX, ptY;

	public Punto(final int ptX, final int ptY) {
		this.setPtX(ptX);
		this.setPtY(ptY);
	}

	public Punto() {
		this(0, 0);
	}

	public int getPtY() {
		return ptY;
	}

	public int getPtX() {
		return ptX;
	}

	public void setPtX(final int ptX) {
		this.ptX = ptX;
	}

	public void setPtY(final int ptY) {
		this.ptY = ptY;
	}

	public double modulo() {
		return Math.sqrt(this.ptX * this.ptX + this.ptY * this.ptY);
	}

	public double fase() {
		return Math.atan((double) this.ptY / this.ptX);
	}

	@Override
	public String toString() {
		return "Punto[" + ptX + "," + ptY + "]";
	}
}
