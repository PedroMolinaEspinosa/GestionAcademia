import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "direccion")
@XmlAccessorType(XmlAccessType.FIELD)

public class Direccion {
	@XmlElement
	private String tipoVia;
	@XmlElement
	private String nombreVia;
	@XmlElement
	private int cp;
	@XmlElement
	private String localidad;

	public Direccion(String tipoVia, String nombreVia, int cp, String localidad) {

		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.cp = cp;
		this.localidad = localidad;
	}

	public Direccion() {

	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cp=" + cp + ", localidad=" + localidad
				+ "]";
	}

}
