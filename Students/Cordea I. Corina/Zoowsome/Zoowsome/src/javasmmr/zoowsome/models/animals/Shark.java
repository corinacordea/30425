package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(String name, int nrOfLegs, Enum waterType, int avgSwimDepth ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	public Shark(){
		this.setName("Skark");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.SALTWATER);
		this.setAvgSwimDepth(100);
	}	
}
