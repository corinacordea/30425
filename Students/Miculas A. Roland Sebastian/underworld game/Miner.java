package underworld.models;

import underworld.utils.*;

public class Miner {
	private String name;
	private int[] backpack;
	private int backpackindex;
	
	public Miner(String name){
		this.name = name;
		backpack = new int[5];
		backpackindex = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int dig(){
		if(isBackPackFull() == true){
			backpack[backpackindex] =Resourses.generateResourse();
			return backpack[backpackindex];
		}
		return -1;
	}
	
	public int sleep(){
		return Resourses.generateResourse();
	}
	
	private boolean isBackPackFull(){
		if(backpackindex == Constants.MINER_BACKPACK_SIZE -1 ){
			return false;
		}
		else{
			return true;
		}
	}
	
	public void showBackPack(){
		System.out.println(getNumberOfBackPackSlots());
		for(int i = 0 ; i<backpackindex ; i++){
			System.out.println(backpack[i]);
		}
	}
	
	private int getNumberOfBackPackSlots(){
		return Constants.MAP_RESOURCES_NUMBER - backpackindex;
	}
}
