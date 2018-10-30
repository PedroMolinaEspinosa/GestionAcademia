import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "facturas")
@XmlAccessorType(XmlAccessType.FIELD)

public class Facturas {

	@XmlElement(name = "factura")
	private static List<Factura> listaFacturas;

	@XmlElement(name = "clientes")
	private static List<Cliente> listaClientes;

	@XmlElement(name = "direcciones")
	private static List<Direccion> listaDirecciones;

	@XmlElement(name = "productos")
	private static List<Producto> listaProductos;

	public Facturas() {
		generarFacturas(100);
	}

	public void addFactura(Factura factura) {
		listaFacturas.add(factura);
	}

	public List<Factura> getListaFacturas() {

		return listaFacturas;
	}

	public void setListaFacturas(List<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public static void rellenarDatos() {
		// Productos
		listaProductos = new ArrayList<Producto>();
		Producto p1 = new Producto(12345, "carcasa", "recarcasa", 100);
		Producto p2 = new Producto(12346, "carcaseta", "recarcasa", 101);
		Producto p3 = new Producto(12347, "carcasita", "recarcasa", 102);
		Producto p4 = new Producto(12348, "carcasota", "recarcasa", 103.99);
		Producto p5 = new Producto(12347, "carcasita", "recarcasa", 102);
		Producto p6 = new Producto(12347, "carcasita", "recarcasa", 102);
		Producto p7 = new Producto(12345, "carcasa", "recarcasa", 100);
		Producto p8 = new Producto(12345, "carcasa", "recarcasa", 100);
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		listaProductos.add(p5);
		listaProductos.add(p6);
		listaProductos.add(p7);
		listaProductos.add(p8);
		// Direccion
		listaDirecciones = new ArrayList<Direccion>();
		Direccion d1 = new Direccion("Calle", "ojete", 23006, "Jaén");
		Direccion d2 = new Direccion("Calle", "ojete", 23006, "Jaén");
		Direccion d3 = new Direccion("Av", "panete", 23008, "Jaén");
		Direccion d4 = new Direccion("Av", "panete", 23008, "Jaén");
		Direccion d5 = new Direccion("Av", "panete", 23008, "Jaén");
		Direccion d6 = new Direccion("Calle", "ole", 23006, "Jaén");
		Direccion d7 = new Direccion("Av", "jujete", 23006, "Jaén");
		Direccion d8 = new Direccion("Av", "jujete", 23006, "Jaén");

		listaDirecciones.add(d1);
		listaDirecciones.add(d2);
		listaDirecciones.add(d3);
		listaDirecciones.add(d4);
		listaDirecciones.add(d5);
		listaDirecciones.add(d6);
		listaDirecciones.add(d7);
		listaDirecciones.add(d8);

		// Clientes
		listaClientes = new ArrayList<Cliente>();
		Cliente c1 = new Cliente("pepe", "ojete", "nose@hot.com", 999999991, "27879364H", 123457, d1);
		Cliente c2 = new Cliente("ay", "ojete", "nose1@hot.com", 999999992, "27879344E", 123457, d2);
		Cliente c3 = new Cliente("que", "si", "nose2@hot.com", 999999993, "27879464A", 123457, d4);
		Cliente c4 = new Cliente("o", "no", "nose3@hot.com", 999999994, "27873364G", 123457, d3);
		Cliente c5 = new Cliente("pepe", "ojete", "nose@hot.com", 999999991, "27879364H", 123457, d1);
		Cliente c6 = new Cliente("pepe", "ojete", "nose@hot.com", 999999991, "27879364H", 123457, d1);
		Cliente c7 = new Cliente("ay", "ojete", "nose1@hot.com", 999999992, "27879344E", 123457, d2);
		Cliente c8 = new Cliente("que", "si", "nose2@hot.com", 999999993, "27879464A", 123457, d4);
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		listaClientes.add(c4);
		listaClientes.add(c5);
		listaClientes.add(c6);
		listaClientes.add(c7);
		listaClientes.add(c8);

	}

	public static void generarFacturas(int numeroDeFacturasAGenerar) {
		listaFacturas = new ArrayList<Factura>();
		rellenarDatos();

		Cliente cliente;
		Direccion direccionFacturacion;
		Producto producto;
		int id;
		Date fecha;

		for (int i = 0; i < numeroDeFacturasAGenerar; i++) {

			cliente = listaClientes.get((int) (Math.random() * 8));
			direccionFacturacion = listaDirecciones.get((int) (Math.random() * 8));
			producto = listaProductos.get((int) (Math.random() * 8));
			id = i;
			fecha = new Date();

			Factura factura = new Factura(cliente, direccionFacturacion, producto, id, fecha);
			listaFacturas.add(factura);
			System.out.println(listaFacturas.toString());
		}

	}
}
