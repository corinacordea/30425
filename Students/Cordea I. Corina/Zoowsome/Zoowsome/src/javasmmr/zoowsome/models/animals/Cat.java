package javasmmr.zoowsome.models.animals;

public class Cat extends Mammal {
	public Cat(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	public Cat(){
		this.setName("cat");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float)39.7);
		this.setPercBodyHair((float)94.5);
	}	
}
