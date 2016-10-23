package underworld.models;

import underworld.utils.Resources;

public class Map {
	private int[] resources = new int[10];
	
	public Map(){
		for(int i = 0; i<10; i++)
			resources[i] = 0;
	}
	
	public void generateResources(){	
		for(int i = 0; i<10; i++)
			resources[i] = Resources.generateValuableResource();
	}
	
	public boolean consumeResource(int resource){
		boolean found = false;
		for(int i = 0; i<10; i++)
			if(this.resources[i] == resource)
			{
				found = true;
				this.resources[i] = -1;
			}
		return found;
	}
	
	public void showResources(){
		for(int i = 0; i<10; i++){
			System.out.print(resources[i] + " ");			
		}
		System.out.println("");
	}
}
