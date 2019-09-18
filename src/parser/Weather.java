package parser;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Dia;

public class Weather {
	private ArrayList<Dia> dias;

	public Weather() {
		DOMParserWeb parser = new DOMParserWeb("http://www.aemet.es/xml/municipios/localidad_45168.xml");
		Document doc = parser.getDocumento();
		Element eleprediccion = (Element) doc.getElementsByTagName("prediccion").item(0);
			NodeList nodedias = eleprediccion.getElementsByTagName("dia");
			dias = new ArrayList<Dia>();
			for (int i=0;i<nodedias.getLength();i++) {
				 Dia dia = new Dia();				
				 Element eledia = (Element) nodedias.item(i);
				 dia.setFecha(eledia.getAttribute("fecha"));
				 Node nodecielo = eledia.getElementsByTagName("estado_cielo").item(0);
				 dia.setIco(nodecielo.getTextContent());
				 dia.setCielo(nodecielo.getAttributes().getNamedItem("descripcion").getTextContent());
				 Node nodelluvia = eledia.getElementsByTagName("prob_precipitacion").item(0);
				 dia.setLluvia(nodelluvia.getTextContent());
				 Element eletemp = (Element) eledia.getElementsByTagName("temperatura").item(0);
					 dia.setMax(Integer.parseInt(eletemp.getElementsByTagName("maxima").item(0).getTextContent()));
					 dia.setMin(Integer.parseInt(eletemp.getElementsByTagName("minima").item(0).getTextContent()));
				 dias.add(dia);
			}
	}
	public ArrayList<Dia> getDias() {
		return dias;
	}
}
