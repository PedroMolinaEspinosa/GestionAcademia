package modelo.DTO;

public class AlumnoAsignatura {

	private int asignatura;
	private int alumno;
	private int faltas;

	// CONSTRUCTOR

	public AlumnoAsignatura() {

	}

	public AlumnoAsignatura(int asignatura, int alumno, int faltas) {
		super();
		this.asignatura = asignatura;
		this.alumno = alumno;
		this.faltas = faltas;
	}

	// G Y S
	public int getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(int asignatura) {
		this.asignatura = asignatura;
	}

	public int getAlumno() {
		return alumno;
	}

	public void setAlumno(int alumno) {
		this.alumno = alumno;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "AlumnoAsignatura [asignatura=" + asignatura + ", alumno=" + alumno + ", faltas=" + faltas + "]";
	}

}
