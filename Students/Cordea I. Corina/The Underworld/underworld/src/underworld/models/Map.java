package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	private int[] resources;
	public Map(){
		resources = new int[Constants.MAP_RESOURCES_NUMBER];
		for (int i = 0; i < resources.length; i++){
			resources[i] = 0;
		}
	}
	public void generateResources(){
		for (int i = 0; i < resources.length; i++){
			resources[i] = Resources.generateValuableResource();
		}
	}
	public boolean consumeResource (int resource){
		boolean resourceFound = false; 
		for (int i = 0; i < resources.length; i++){
			if (resources[i] == resource){
				resources[i] = -1;
				resourceFound = true;
			}
		}
		return resourceFound;
	}
	public void showResources(){
		System.out.print("[Map] Resources: ");
		for (int i = 0; i < resources.length; i++){
			System.out.print(resources[i] + " ");
		}
		System.out.println();
	}
}
