package poo.alquiler;



public class Cliente {
	private String DNI;
	private String fechaNacimiento;

	public String getDNI() {
		return DNI;
	}

	public Cliente(String dNI, String fechaNacimiento) {
		
		this.DNI = dNI;
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
