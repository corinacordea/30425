package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{

	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Birds.SWAN.equals(type))
		{
			return new Swan();
		}
		else if(Constants.Animals.Birds.EAGLE.equals(type))
		{
			return new Eagle();
		}
		else if(Constants.Animals.Birds.DUCK.equals(type))
		{
			return new Duck();
		}
		else
			throw new Exception("Invalid animal exception");
	}
}
