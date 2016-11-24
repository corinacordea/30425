package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Cuckoo extends Bird{
	public Cuckoo(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc  ){
		super (maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	public Cuckoo(){
		this("Cuckoo", 2, true, 1234, 1.5, 0);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.CUCKOO);
	}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}		
}
