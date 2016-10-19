package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack;
	private int backpackIndex = 0;
	public Miner (String name){
		this.name = name;
		backpack = new int [Constants.MINER_BACKPACK_SIZE];
		for (int i = 0; i < backpack.length; i++){
			backpack[i] = -1;
		}
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int dig(){
		if (!isBackpackFull()){
					backpack[backpackIndex] = Resources.generateResource();
					System.out.println("[Miner] I have found " + backpack[backpackIndex]);
					return(backpack[backpackIndex++]);
				}
		return -1;
	}
	public int sleep(){
		int resource = Resources.generateResource();
		System.out.println("[Miner] " + resource + " decayed during my sleep..");
		return resource;
	}
	private boolean isBackpackFull(){
		boolean backpackFull = true;
		if (getNumberOfBackpackSlots() > 0){
			backpackFull = false;
		}
		return backpackFull;
	}
	public void showBackpack(){
		System.out.print("[Miner] My backpack: ");
		for (int i = 0; i < backpack.length; i++){
			System.out.print(backpack[i] + " ");
		}
		System.out.println("(" + getNumberOfBackpackSlots() + ")" + " empty slots left!");
	}
	private int getNumberOfBackpackSlots(){
		int numberOfEmptySlots = 0;
		for (int i = 0; i < backpack.length; i++){
			if (backpack[i] == -1) {
				numberOfEmptySlots++;
			}
		}
		return numberOfEmptySlots;
	}
}
