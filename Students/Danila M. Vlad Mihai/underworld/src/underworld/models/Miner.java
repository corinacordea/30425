package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;
public class Miner {
	private  String name;
	private  int[] backpack;
	private int backpackIndex;
	
	
	public  Miner(String name){
		backpack = new int[Constants.MINER_BACKPACK_SIZE];
		 		this.name = name;
		 		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++){
		 			backpack[i] = -1;
		 		}
	}
	public String getName(){
		return(this.name=name);
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int dig(){
		if (isBackpackFull()){
		return (-1);
			 		}
			 		else{
			 			for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++){
			 				if (backpack[i] == -1){
			 					backpack[i] = Resources.generateResource();
			 					return (backpack[i]);
			 				}
			 			}
			 		}
			 		return (-2);
	}
	
	public int sleep(){
		return (Resources.generateResource());	
	}
	
	private int getNumberOfBackpackSlots(){
		int emptySlots = 0;
		 		
		 		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++){
		 			if (backpack[i] == -1){
		 				emptySlots++;
		 			}
		 		}
		 		return (emptySlots);
		 	}
	
	private boolean isBackpackFull(){
		return (getNumberOfBackpackSlots() == 0);
	}
}


