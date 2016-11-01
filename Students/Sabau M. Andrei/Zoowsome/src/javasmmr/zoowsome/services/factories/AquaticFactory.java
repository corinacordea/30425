package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory{

	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Aquatics.SHARK.equals(type))
		{
			return new Shark();
		}
		else if(Constants.Animals.Aquatics.OCTOPUS.equals(type))
		{
			return new Octopus();
		}
		else if(Constants.Animals.Aquatics.FISH.equals(type))
		{
			return new Fish();
		}
		else
			throw new Exception("Invalid animal exception");
	}
}
