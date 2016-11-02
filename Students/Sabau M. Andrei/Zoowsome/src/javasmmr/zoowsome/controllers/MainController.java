package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class MainController {

	public static void main(String[] args)
	{
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
		a1.setName("tiger1");
		a1.setNrOfLegs(4);
		System.out.println("We have an animal called " + a1.getName() + " with " + a1.getNrOfLegs() + "number of legs" );
	}
}
