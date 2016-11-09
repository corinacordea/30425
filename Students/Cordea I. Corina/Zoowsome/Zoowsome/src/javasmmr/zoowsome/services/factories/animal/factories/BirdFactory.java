package javasmmr.zoowsome.services.factories.animal.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Birds;

public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Birds.CUCKOO.equals(type) ){
			return new Cuckoo(); 
		}else if( Constants.Animals.Birds.EAGLE.equals(type) ){
			return new Eagle();
		}else if( Constants.Animals.Birds.HAWK.equals(type) ){
			return new Hawk();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
