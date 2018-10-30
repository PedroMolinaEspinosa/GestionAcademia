import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {

	public static void main(String[] args) {
		Facturas facturas = new Facturas();
//
		try {
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(facturas.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// Marshal the employees list in file
			jaxbMarshaller.marshal(facturas, new File("facturas.xml"));
		} catch (JAXBException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(Marshaller.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
