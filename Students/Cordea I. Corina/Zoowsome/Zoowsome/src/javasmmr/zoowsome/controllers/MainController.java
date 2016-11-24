package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.animal.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.factories.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.CareTaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.employee.factories.*;

import java.util.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		SpeciesFactory speciesFactoryAquatics = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
		SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
		SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
		SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
	
		Random random = new Random();
        Animal[] zooAnimal = new Animal[Constants.ZOO_CAPACITY];
        int randomIntAnimal;
        for(int i = 0; i < Constants.ZOO_CAPACITY; i++){
            randomIntAnimal = random.nextInt(12);
            switch (randomIntAnimal){
                case 0:
                    zooAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.MONKEY);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("Its body temperature is : " +( (Mammal)zooAnimal[i] ).getNormalBodyTemp() );
					System.out.println( ( (Mammal)zooAnimal[i] ).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 1:
                    zooAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.CAT);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("Its body temperature is : " +( (Mammal)zooAnimal[i] ).getNormalBodyTemp() );
					System.out.println( ( (Mammal)zooAnimal[i] ).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    zooAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.TIGER);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("Its body temperature is : " +( (Mammal)zooAnimal[i] ).getNormalBodyTemp() );
					System.out.println( ( (Mammal)zooAnimal[i] ).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    zooAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SALMON);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println(zooAnimal[i].getName()+" preferes "+ ((Aquatic)zooAnimal[i]).getWaterType());
					System.out.println("Its average swim depth is "+ ((Aquatic)zooAnimal[i]).getAvgSwimDepth() + " meters" );
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 4:
                    zooAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SHARK);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println(zooAnimal[i].getName()+" preferes "+ ((Aquatic)zooAnimal[i]).getWaterType());
					System.out.println("Its average swim depth is "+ ((Aquatic)zooAnimal[i]).getAvgSwimDepth() + " meters" );
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 5:
                    zooAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SALMON);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println(zooAnimal[i].getName()+" preferes "+ ((Aquatic)zooAnimal[i]).getWaterType());
					System.out.println("Its average swim depth is "+ ((Aquatic)zooAnimal[i]).getAvgSwimDepth() + " meters" );
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 6:
                    zooAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.ANT);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This insect is flying:" + ((Insect)zooAnimal[i]).getCanFly());
                    System.out.println("Is a dangerous insect:" + ((Insect)zooAnimal[i]).getIsDangerous());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 7:
                    zooAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.BEE);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This insect is flying:" + ((Insect)zooAnimal[i]).getCanFly());
                    System.out.println("Is a dangerous insect:" + ((Insect)zooAnimal[i]).getIsDangerous());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 8:
                    zooAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.BUG);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This insect is flying:" + ((Insect)zooAnimal[i]).getCanFly());
                    System.out.println("Is a dangerous insect:" + ((Insect)zooAnimal[i]).getIsDangerous());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 9:
                    zooAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.BLACKSNAKE);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This reptile lays eggs:" + ((Reptile)zooAnimal[i]).getLaysEggs());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 10:
                    zooAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.LIZARD);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This reptile lays eggs:" + ((Reptile)zooAnimal[i]).getLaysEggs());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 11:
                    zooAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.VIPER);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This reptile lays eggs:" + ((Reptile)zooAnimal[i]).getLaysEggs());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 12:
                    zooAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.EAGLE);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This bird migrates:" + ((Bird)zooAnimal[i]).getMigrates());
                    System.out.println("Its average flight altitude is " + ((Bird)zooAnimal[i]).getAvgFlightAltitude()+ " meters" );
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 13:
                    zooAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.CUCKOO);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This bird migrates:" + ((Bird)zooAnimal[i]).getMigrates());
                    System.out.println("Its average flight altitude is " + ((Bird)zooAnimal[i]).getAvgFlightAltitude()+ " meters" );
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
                case 14:
                    zooAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.HAWK);
                    System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
                    System.out.println("This bird migrates:" + ((Bird)zooAnimal[i]).getMigrates());
                    System.out.println("Its average flight altitude is " + ((Bird)zooAnimal[i]).getAvgFlightAltitude()+ " meters" );
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    break;
            }
        }
	    CareTakerFactory careTakerFactory = new CareTakerFactory();
		Employee[] careTaker = new Employee[Constants.NR_WORKERS];
		for (int i=0; i< Constants.NR_WORKERS; i++){
			careTaker[i] = careTakerFactory.getEmployeeFactory(Constants.Employees.CARETAKER);
		}
		for(Employee c: careTaker){
			 for(Animal a: zooAnimal){
				 if ( (c.getIsDead() == false) && (a.getTakenCareOf() == false)){
					 String result = ((CareTaker)c).takeCareOf(a);
	        			if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
			         		c.setIsDead(true);
	        			}
			         	else if( result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
			         		continue;
		       			}
	        			else if (result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)){
	        				a.setTakenCareOf(true);
		     			}
		       	 }
		      }
		 }
		
		int i = 0, j=0;
	    for(Animal a: zooAnimal){
	    	System.out.println("Animal " + i++ + " " + a.getName() + " maintenanceCost = " + a.getMaintenanceCost() + " hours/week; takenCareOf = " + a.getTakenCareOf());
	    	System.out.println();
	    }
	    for(Employee c: careTaker){
        	System.out.println(c.getName() + j++ + " id: " + c.getId() + " " + ((CareTaker)c).getWorkingHours() + " hours; dead = " + c.getIsDead());
        	System.out.println();
        }
	    
		AnimalRepository repository = new AnimalRepository();			
	    ArrayList<Animal> animalList = new ArrayList<Animal>();
	    for(i = 0; i < Constants.ZOO_CAPACITY; i++){
	    		animalList.add(zooAnimal[i]);
	    }
	    repository.save(animalList);
	    ArrayList<Animal> animalList2 = new ArrayList<Animal>();
	    animalList2 = repository.load();
	    for(i = 0; i < animalList2.size(); i++){
	    	System.out.println(animalList2.get(i).toString());
	    }
	}	
}
