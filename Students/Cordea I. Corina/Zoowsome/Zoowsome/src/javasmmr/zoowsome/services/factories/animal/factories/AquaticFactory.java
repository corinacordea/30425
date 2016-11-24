package javasmmr.zoowsome.services.factories.animal.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Aquatics.CRAP.equals(type) ){
			return new Crap(); 
		}else if( Constants.Animals.Aquatics.SALMON.equals(type) ){
			return new Salmon();
		}else if( Constants.Animals.Aquatics.SHARK.equals(type) ){
			return new Shark();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
