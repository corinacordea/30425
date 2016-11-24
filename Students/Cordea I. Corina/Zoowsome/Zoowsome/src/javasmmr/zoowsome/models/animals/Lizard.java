package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Lizard extends Reptile{
	public Lizard(String name, int nrOfLegs, boolean laysEggs, double maintenanceCost, double dangerPerc ){
		super (maintenanceCost, dangerPerc); 
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public Lizard(){
		this("Lizard", 4, true, 1, 0.3);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.LIZARD);
	}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
