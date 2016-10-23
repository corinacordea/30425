package underworld.models;

import java.util.Arrays;

import underworld.utils.*;

public class Map {
	private static int[] resources = new int[Constants.MAP_RESOURCES_NUMBER];
	
	public Map() {
	}
	
	public void generateResources(){
		for(int i = 0; i < resources.length; i++ ) {
			resources[i] = Resources.generateValuableResource();
		}
	}
	
	public static boolean consumeResources(int resource) {
		boolean found = false;
		for(int i = 0; i < resources.length; i++) {
			if(resources[i] == resource){
				resources[i] = -1;
				found = true;
			}
		}
		if(found == true) {
			return true;
		}
		return false;
	}
	
	public void showResources() {
		String string = Arrays.toString(resources);
		string = string.replace('[', ' ');
		string = string.replace(']', ' ');
		string = string.replace(',', ' ');
		System.out.println("[Map]  Resources: "+string);
	}
}
