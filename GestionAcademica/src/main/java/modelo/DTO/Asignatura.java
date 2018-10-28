package modelo.DTO;

public class Asignatura {

	private String nombre;
	private int curso;
	private String ciclo;

	// CONSTRUCTOR

	public Asignatura(String nombre, int curso, String ciclo) {

		this.nombre = nombre;
		this.curso = curso;
		this.ciclo = ciclo;
	}

	public Asignatura() {

	}

	// G Y S

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	// TO STRING

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", curso=" + curso + ", ciclo=" + ciclo + "]";
	}

}
