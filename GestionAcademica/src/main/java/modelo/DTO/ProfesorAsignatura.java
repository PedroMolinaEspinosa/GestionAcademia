package modelo.DTO;

public class ProfesorAsignatura {

	private int asignatura;
	private int profesor;
	private int horasSemanales;

	// CONSTRUCTOR

	public ProfesorAsignatura() {
		
	}

	public ProfesorAsignatura(int asignatura, int profesor, int horasSemanales) {
		super();
		this.asignatura = asignatura;
		this.profesor = profesor;
		this.horasSemanales = horasSemanales;
	}

	// G Y S

	public int getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(int asignatura) {
		this.asignatura = asignatura;
	}

	public int getProfesor() {
		return profesor;
	}

	public void setProfesor(int profesor) {
		this.profesor = profesor;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "ProfesorAsignatura [asignatura=" + asignatura + ", profesor=" + profesor + ", horasSemanales="
				+ horasSemanales + "]";
	}

}
