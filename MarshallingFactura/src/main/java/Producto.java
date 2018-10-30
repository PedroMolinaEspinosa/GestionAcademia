import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "producto")
@XmlAccessorType(XmlAccessType.FIELD)

public class Producto {
	@XmlElement
	private long id;
	@XmlElement
	private String nombre;
	@XmlElement
	private String descrip;
	@XmlElement
	private double precio;

	public Producto(long id, String nombre, String descrip, double precio) {

		this.id = id;
		this.nombre = nombre;
		this.descrip = descrip;
		this.precio = precio;
	}

	public Producto() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descrip=" + descrip + ", precio=" + precio + "]";
	}

}
