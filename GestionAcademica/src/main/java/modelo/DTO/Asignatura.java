package modelo.DTO;

public class Asignatura {

	private Integer id;
	private String nombre;
	private Integer curso;
	private String ciclo;

	// CONSTRUCTOR

	public Asignatura(int id, String nombre, int curso, String ciclo) {
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.ciclo = ciclo;
	}

	public Asignatura(String nombre, int curso, String ciclo) {
		this.id = null;
		this.nombre = nombre;
		this.curso = curso;
		this.ciclo = ciclo;
	}

	public Asignatura() {
		this.id = null;
		this.nombre = null;
		this.curso = null;
		this.ciclo = null;
	}

	// G Y S

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

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
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", curso=" + curso + ", ciclo=" + ciclo + "]";
	}

}
