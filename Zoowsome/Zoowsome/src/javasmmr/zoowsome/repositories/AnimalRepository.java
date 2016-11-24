package javasmmr.zoowsome.repositories;

import javax.xml.stream.events.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.stream.*;
import java.util.ArrayList;
import org.xml.sax.SAXException;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;


public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		
	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException{
 		
 		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance(); 
 		
 		// create XMLEventWriter
 		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
 		
 		//create an EventFactory
 		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
 		XMLEvent end = eventFactory.createDTD("\n");
 		
 		//create and write Start Tag
 		StartDocument startDocument = eventFactory.createStartDocument();
 		eventWriter.add(startDocument);
 		
 		//Create content Open Tag
 		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
 		eventWriter.add(configStartElement);
 		eventWriter.add(end);
 		
 		for(XML_Parsable animal: animals){
 			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
 			eventWriter.add(sElement);
 			eventWriter.add(end);
 			
 			animal.encodeToXml(eventWriter);
 			
 			EndElement eElement = eventFactory.createEndElement("", "" , Constants.XML_TAGS.ANIMAL);
 			eventWriter.add(eElement);
			eventWriter.add(end);
 		}
		
 		eventWriter.add(eventFactory.createEndElement("", "", "content"));
 		eventWriter.add(eventFactory.createEndDocument());
 		eventWriter.close();
 		
}
public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException{
 		ArrayList<Animal> animals = new ArrayList<Animal>();
 		
 		File fXmlFile = new File(XML_FILENAME);
 		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
 		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
 		Document doc = dBuilder.parse(fXmlFile);
 		doc.getDocumentElement().normalize();
 		
 		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
 		
 		for(int i = 0; i < nodeList.getLength(); i++){
 			Node node = nodeList.item(i);
 			
 			if(node.getNodeType() == Node.ELEMENT_NODE){
 				Element element = (Element) node;
 				
 				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
 		
 				switch(discriminant){
 				case Constants.Animals.Aquatics.CRAP:
 					Animal crap = new Crap();
 					crap.decodeFromXml(element);
 					animals.add(crap);
 					break;
 				case Constants.Animals.Aquatics.SALMON:
 					Animal salmon = new Salmon();
 					salmon.decodeFromXml(element);
 					animals.add(salmon);
 					break;	
 				case Constants.Animals.Aquatics.SHARK:
 					Animal shark = new Shark();
 					shark.decodeFromXml(element);
 					animals.add(shark);
 					break;
 				case Constants.Animals.Birds.CUCKOO:
 					Animal cuckoo = new Cuckoo();
 					cuckoo.decodeFromXml(element);
 					animals.add(cuckoo);
 					break;
 				case Constants.Animals.Birds.EAGLE:
 					Animal eagle = new Eagle();
 					eagle.decodeFromXml(element);
 					animals.add(eagle);
 					break;
 				case Constants.Animals.Birds.HAWK:
 					Animal hawk = new Hawk();
 					hawk.decodeFromXml(element);
 					animals.add(hawk);
 					break;
 				case Constants.Animals.Insects.ANT: 
 					Animal ant = new Ant();
 					ant.decodeFromXml(element);
 					animals.add(ant);
 					break;
 				case Constants.Animals.Insects.BEE:
 					Animal bee = new Bee();
 					bee.decodeFromXml(element);
 					animals.add(bee);
 					break;
 				case Constants.Animals.Insects.BUG:
 					Animal bug = new Bug();
 					bug.decodeFromXml(element);
 					animals.add(bug);
 					break;	
 				case Constants.Animals.Mammals.CAT:
 					Animal cat = new Cat();
 					cat.decodeFromXml(element);
 					animals.add(cat);
 					break;	
 				case Constants.Animals.Mammals.MONKEY:
 					Animal monkey = new Monkey();
 					monkey.decodeFromXml(element);
 					animals.add(monkey);
 					break;
 				case Constants.Animals.Mammals.TIGER:
 	 				Animal tiger = new Tiger();
 	 					tiger.decodeFromXml(element);
 	 					animals.add(tiger);
 	 					break;
 				case Constants.Animals.Reptiles.BLACKSNAKE:
 					Animal blacksnake = new BlackSnake();
 					blacksnake.decodeFromXml(element);
 					animals.add(blacksnake);
 					break;
 				case Constants.Animals.Reptiles.LIZARD:
 					Animal lizard = new Lizard();
 					lizard.decodeFromXml(element);
 					animals.add(lizard);
 					break;	
 				case Constants.Animals.Reptiles.VIPER:
 					Animal viper = new Viper();
 					viper.decodeFromXml(element);
 					animals.add(viper);
 					break;
 				default: 
 					break;
 				}
 			}
 		}
 		return animals;
 }
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException{
 		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
 		XMLEvent end = eventFactory.createDTD("\n");
 		XMLEvent tab = eventFactory.createDTD("\t");
 		
 		//create start node
 		StartElement sElement = eventFactory.createStartElement("", "", name);
 		
 		eventWriter.add(tab);
 		eventWriter.add(sElement);
 		
 		//create content
 		Characters characters = eventFactory.createCharacters(value);
 		
 		eventWriter.add(characters);
 		
 		//create end node
 		EndElement eElement = eventFactory.createEndElement("", "", name);
 		
 		eventWriter.add(eElement);
 		eventWriter.add(end);
	}
}

