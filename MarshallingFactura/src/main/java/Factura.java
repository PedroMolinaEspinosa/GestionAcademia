import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "factura")
@XmlAccessorType(XmlAccessType.FIELD)

public class Factura {
	@XmlElement
	private Cliente cliente;
	@XmlElement
	private Direccion direccionFacturacion;

	@XmlElement
	private Producto producto;
	@XmlElement
	private int id;
	@XmlElement
	private Date fecha;

	public Factura(Cliente cliente, Direccion direccionFacturacion, Producto producto, int id, Date fecha) {

		this.cliente = cliente;
		this.direccionFacturacion = direccionFacturacion;
		this.producto = producto;
		this.id = id;
		this.fecha = fecha;
	}

	public Factura() {

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Direccion getDireccionFacturacion() {
		return direccionFacturacion;
	}

	public void setDireccionFacturacion(Direccion direccionFacturacion) {
		this.direccionFacturacion = direccionFacturacion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", direccionFacturacion=" + direccionFacturacion + ", producto="
				+ producto + ", id=" + id + ", fecha=" + fecha + "]";
	}

}
