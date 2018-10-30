import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cliente")
@XmlAccessorType(XmlAccessType.FIELD)

public class Cliente {
	@XmlElement
	private String nombre;
	@XmlElement
	private String apellido;
	@XmlElement
	private String email;
	@XmlElement
	private long telefono;
	@XmlAttribute
	private String nif;
	@XmlElement
	private long id;
	@XmlElement
	private Direccion direccion;

	public Cliente(String cliente, String apellido, String email, long telefono, String nif, long id,
			Direccion direccion) {

		this.nombre = cliente;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.nif = nif;
		this.id = id;
		this.direccion = direccion;
	}

	public Cliente() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [cliente=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
				+ ", nif=" + nif + ", id=" + id + ", direccion=" + direccion + "]";
	}

}
