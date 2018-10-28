package modelo.DTO;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;

	// Constructor
	public Alumno() {

	}

	public Alumno(String nombre, String apellidos, int telefono, String dni) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
	}

	// G y S

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

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

	// TOSTRING

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", dni=" + dni
				+ "]";
	}

}
