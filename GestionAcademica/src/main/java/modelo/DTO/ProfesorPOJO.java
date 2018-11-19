package modelo.DTO;

public class ProfesorPOJO {

	private String nombre;
	private String apellidos;
	private Integer id;

	// Constructor

	public ProfesorPOJO() {

		this.nombre = null;
		this.apellidos = null;
		this.id = null;

	}

	public ProfesorPOJO(int id, String nombre, String apellidos) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
	}

	public ProfesorPOJO(String nombre, String apellidos) {
		this.id = null;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// G Y S

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return id;
	}

	public void setTelefono(int telefono) {
		this.id = telefono;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Profesor nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id;
	}

}
