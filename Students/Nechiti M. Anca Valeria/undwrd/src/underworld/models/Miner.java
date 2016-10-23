package underworld.models;

import java.util.Arrays;

import underworld.utils.Constants;

import underworld.utils.Resources;

public class Miner {
	 private String name;
	 private int[] backpack = new int[Constants.MINER_BACKPACK_SIZE];
	 private int backpackIndex; //variable in which we will store the current
	 							//position in which we will be able to place
	 							//some resource inside our miner's backpack array
	 
	 
	 public Miner(String name) {
		 for(int i = 0; i < backpack.length; i++) {
			 backpack[i] = -1;
		 }
		 //Arrays.fill(backpack, -1);
		 backpackIndex = 0;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 private boolean isBackpackFull() {
		 
		 for(int i = 0; i < backpack.length; i++) {
			 if(backpack[i] == -1) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public int dig() {
		 if(isBackpackFull() != true) {
			 int resource = Resources.generateResource();
			 backpack[backpackIndex] = resource;
			 backpackIndex++;
			 return resource;
			 }
		 return -1; //BackpackFull
	 }
	 
	 public int sleep() {
		 int resource = Resources.generateResource();
		 return resource;
	 }
	
	 
	 public void showBackpack() {
		int slots = getNumberOfBackpackSlots();
		String string = Arrays.toString(backpack);
		string = string.replace('[', ' ');
		string = string.replace(']', ' ');
		string = string.replace(',', ' ');
		System.out.println("[Miner] My Backpack: "+string+" ("+slots+") backpack slots left!");
	 }
	 
	 private int getNumberOfBackpackSlots() {
		 int numberOfSlots = 0;
		 for(int i = backpackIndex; i < backpack.length; i++) {
			 if(backpack[i] == -1) {
				 numberOfSlots++;
			 }
		 }
		 return numberOfSlots;
	 }
}
