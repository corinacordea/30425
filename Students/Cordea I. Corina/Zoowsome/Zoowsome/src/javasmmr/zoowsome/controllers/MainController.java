package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.animal.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.factories.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.CareTaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.employee.*;
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
		Animal a1 = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.CAT);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());

		Random random = new Random();
        Animal[] zooAnimal = new Animal[Constants.ZOO_CAPACITY];
        int randomIntAnimal;
        for(int i = 0; i < Constants.ZOO_CAPACITY; i++){
            randomIntAnimal = random.nextInt(12);
            switch (randomIntAnimal){
                case 0:
                    zooAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.MONKEY);
                    break;
                case 1:
                    zooAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.CAT);
                    break;
                case 2:
                    zooAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.TIGER);
                    break;
                case 3:
                    zooAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SALMON);
                    break;
                case 4:
                    zooAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SHARK);
                    break;
                case 5:
                    zooAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SALMON);
                    break;
                case 6:
                    zooAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.ANT);
                    break;
                case 7:
                    zooAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.BEE);
                    break;
                case 8:
                    zooAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.BUG);
                    break;
                case 9:
                    zooAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.BLACKSNAKE);
                    break;
                case 10:
                    zooAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.LIZARD);
                    break;
                case 11:
                    zooAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.VIPER);
                    break;
                case 12:
                    zooAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.EAGLE);
                    break;
                case 13:
                    zooAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.CUCKOO);
                    break;
                case 14:
                    zooAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.HAWK);
                    break;
            }
        }
        for (int i = 0; i < Constants.ZOO_CAPACITY; i++){
	          System.out.printf("We have an %s with %d legs!\n", zooAnimal[i].getName(), zooAnimal[i].getNrOfLegs());
        }
	    CareTakerFactory careTakerFactory = new CareTakerFactory();
		Employee[] careTaker = new Employee[Constants.NR_WORKERS];
		for (int i=0; i< Constants.NR_WORKERS; i++){
			careTaker[i] = careTakerFactory.getEmployeeFactory(Constants.Employees.CARETAKER);
		}
		for(int i = 0; i < Constants.NR_WORKERS; i++){
			 for(int j = 0; j < Constants.ZOO_CAPACITY; j++){
				 if ( (careTaker[i].getIsDead() == false) && (zooAnimal[j].getTakenCareOf() == false)){
					 String result = ((CareTaker)careTaker[i]).takeCareOf(zooAnimal[j]);
	        			if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
			         		careTaker[i].setIsDead(true);
	        			}
			         	else if( result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
			         		continue;
		       			}
	        			else if (result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)){
		       				zooAnimal[j].setTakenCareOf(true);
		     			}
		       	 }
		      }
		 }
		int i = 0;
	    for(Animal a: zooAnimal){
	    	System.out.println("Animal " + i++ + " " + a.getName() + " maintenanceCost = " + a.getMaintenanceCost() + " hours/week; takenCareOf = " + a.getTakenCareOf());
	    }
	    for(Employee c: careTaker){
        	System.out.println(c.getName() + " id: " + c.getId() + " " + ((CareTaker)c).getWorkingHours() + "hours dead = " + c.getIsDead());
        }
	
	}	
}
