package underworld.models;
import underworld.utils.*;
public class Map {

	private int[] resources;
	
	public Map(){
		int resourceNumber = Constants.MAP_RESOURCES_NUMBER;
		resources = new int[resourceNumber];
		for (int i = 0; i<resourceNumber; i++){
			resources[i] = -1;
		}
		
	}
	
	public void generateResources(){
		for (int i = 0; i<Constants.MAP_RESOURCES_NUMBER; i++){
			
			resources[i] = Resources.generateValuableResource();
		}
		
	}
	
	public boolean consumeResource(int resource){
		
		boolean found = false;
		
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++){
			if(resources[i] == resource){
				resources[i] = -1;
				found = true;
			}
		}
			return found;
	}
	
	public void showResources(){
		
		System.out.print("[Map] Resources: ");
		for (int i = 0; i< Constants.MAP_RESOURCES_NUMBER; i++){
			System.out.print( resources[i] + " ");
		}
		System.out.println(" ");
	}
	
	
}
