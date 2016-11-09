package javasmmr.zoowsome.models.animals;

public class BlackSnake extends Reptile{
	public BlackSnake(String name, int nrOfLegs, boolean laysEggs ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public BlackSnake(){
		this.setName("BlackSnake");
		this.setNrOfLegs(0);
		this.setLaysEggs(true);
	}
}
