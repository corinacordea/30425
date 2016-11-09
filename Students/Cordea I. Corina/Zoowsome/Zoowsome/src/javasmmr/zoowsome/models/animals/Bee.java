package javasmmr.zoowsome.models.animals;

public class Bee extends Insect{
	public Bee(String name, int nrOfLegs, boolean canFly, boolean isDangerous ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	public Bee (){
		this.setName("Bee");
		this.setNrOfLegs(4);
		this.setCanFly(true);
		this.setIsDangerous(true);
	}
}
