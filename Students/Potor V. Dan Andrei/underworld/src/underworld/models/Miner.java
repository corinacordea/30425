package underworld.models;

import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack = new int[5];
	private int backpackIndex = 0;
	
	public Miner(String name){
		this.name = name;
		for(int i = 0; i<5; i++)
			backpack[i] = -1;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int dig(){
		if(!isBackpackFull()){
			backpack[backpackIndex] = Resources.generateResource();
			return backpack[backpackIndex++];
		}	
		else
			return -1;
	}
	
	public int sleep(){
		return Resources.generateResource();
	}
	
	private boolean isBackpackFull(){
		if(getNumberOfBackpackSlots() > 0)
			return false;
		else
			return true;
	}
	
	public void showBackpack(){
		for(int i = 0; i<5; i++){
			System.out.print(backpack[i] + " ");			
		}
		System.out.println("");
			
	}
	
	private int getNumberOfBackpackSlots(){
		return 5 - backpackIndex;
	}
}
