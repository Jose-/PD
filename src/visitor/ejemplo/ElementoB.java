package visitor.ejemplo;

public class ElementoB implements Elemento {
	private String atributoB;

	public ElementoB() {
		this.setAtributoB("B");
	}

	public String getAtributoB() {
		return atributoB;
	}

	public void setAtributoB(String atributoB) {
		this.atributoB = atributoB;
	}

	@Override
	public void aceptar(Visitante v) {
		v.visitarElementoB(this);
	}
}
