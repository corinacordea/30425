package javasmmr.zoowsome.models.animals;


public abstract class Animal implements Killer{

	private int nrOfLegs;
	private String name;
	private double maintenanceCost;//how many hours per week will a specific animal require attention from one or more employees; values are in [0.1, 8.0] interval
	private double dangerPerc;//how dangerous an animal is; values are in [0, 1] interval
	private boolean takenCareOf = false;
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getMaintenanceCost(){
		return maintenanceCost; 
	}
	
	public void setMaintenanceCost(double maintenanceCost){
		this.maintenanceCost = maintenanceCost;
	}
	
	public double getDangerPerc(){
		return dangerPerc;
	}
	
	public void setDangerPerc(double dangerPerc){
		this.dangerPerc = dangerPerc;
	}
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
	public boolean kill(){
		
		return (Math.random() < dangerPerc);
		//If the generated number is strictly bellow the dangerPerc field, then return true 
		//(meaning, the animal kills the interacting entity), else return false
	}
	
}
