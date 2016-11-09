package javasmmr.zoowsome.models.animals;

public class Tiger  extends Mammal{
	public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	public Tiger(){
		this.setName("Tiger");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float)37.5);
		this.setPercBodyHair((float)92.5);
	}	
}
