package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Monkey extends Mammal{
		public Monkey(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc  ){
			super (maintenanceCost, dangerPerc);
			this.setName(name);
			this.setNrOfLegs(nrOfLegs);
			this.setNormalBodyTemp(normalBodyTemp);
			this.setPercBodyHair(percBodyHair);
		}
		public Monkey(){
			this("Monkey", 4, (float)36.7, (float)87.5, 4, 0.3);
		}
		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
			super.encodeToXml(eventWriter);
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.MONKEY);
		}
		@Override
		public void decodeFromXml(Element element) {
			// TODO Auto-generated method stub
			
		}	
}
