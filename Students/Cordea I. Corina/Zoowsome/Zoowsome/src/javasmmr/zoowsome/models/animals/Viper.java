package javasmmr.zoowsome.models.animals;

public class Viper extends Reptile {
	public Viper(String name, int nrOfLegs, boolean laysEggs ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public Viper(){
		this.setName("Viper");
		this.setNrOfLegs(0);
		this.setLaysEggs(true);
	}
}
