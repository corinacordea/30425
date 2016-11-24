package javasmmr.zoowsome.models.animals;

public class Elephant extends Mammal {
	
	public Elephant(String name, int legs, float temp, float hair){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setNormalBodyTemp(temp);
		this.setPercBodyHair(hair);
	}
	
	public Elephant(){
		this.setName("Elephant");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(35);
		this.setPercBodyHair(5);
	}

}
