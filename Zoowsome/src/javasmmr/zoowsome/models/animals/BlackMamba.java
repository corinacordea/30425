package javasmmr.zoowsome.models.animals;

public class BlackMamba extends Reptile {
	
	public BlackMamba(String name, int legs, boolean layEggs){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setLayEggs(layEggs);
		
	}
	
	public BlackMamba(){
		this.setName("Black Mamba");
		this.setNrOfLegs(0);
		this.setLayEggs(true);

	}

}
