package javasmmr.zoowsome.services.factories.animal.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class ReptileFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Reptiles.BLACKSNAKE.equals(type) ){
			return new BlackSnake(); 
		}else if( Constants.Animals.Reptiles.LIZARD.equals(type) ){
			return new Lizard();
		}else if( Constants.Animals.Reptiles.VIPER.equals(type) ){
			return new Viper();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
