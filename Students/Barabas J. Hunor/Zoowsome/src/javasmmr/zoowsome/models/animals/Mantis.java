package javasmmr.zoowsome.models.animals;

public class Mantis extends Insect {
	
	public Mantis(String name, int nrOfLegs, boolean isDangerous, boolean canFly){
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setIsDangerous(isDangerous);
		this.setCanFly(canFly);
		
	}
	
	public Mantis(){
		this.setName("Mantis");
		this.setNrOfLegs(6);
		this.setIsDangerous(false);
		this.setCanFly(false);

	}
}
