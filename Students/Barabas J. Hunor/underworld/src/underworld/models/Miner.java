package underworld.models;

import underworld.utils.*;

public class Miner {

	private String name;
	private int[] backpack;
	private int backpackIndex = 0;
	
	public Miner(String name){
		backpack = new int[Constants.MINER_BACKPACK_SIZE];
		for (int i = 0 ; i < Constants.MINER_BACKPACK_SIZE ; i++){
		backpack[i] = -1;
		}
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int dig(){
		if(isBackpackFull() == false){
			backpack[backpackIndex] = Resources.generateResource();
			return backpack[backpackIndex];
		}else{
			System.out.println("The bag is full");
		}
		backpackIndex++;
		return -1;
	}
	
	public int sleep(){
		return Resources.generateResource();
	}
	
	private boolean isBackpackFull(){
		boolean full = false;
		if(backpackIndex == Constants.MINER_BACKPACK_SIZE){
				full = true;
		}

		return full;
	}
	
	public void showBackpack(){
		System.out.println("[Miner] The contents of the backpack:");
		for(int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++){
			System.out.print( backpack[i] + " ");
		}
		getNumberOfBackpackSlots();
		
		
	}
	private void getNumberOfBackpackSlots(){
		int free = Constants.MINER_BACKPACK_SIZE - backpackIndex;
		System.out.println("The number of free slots:" + free);
		
	}
	
}
