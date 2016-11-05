package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	private static int counter = 0;
	
	public Shark(int avgSwimDepth, waterType typeOfWater, int nrOfLegs, String  name, double maintenanceCost, double dangerPerc){
		setAvgSwimDepth(avgSwimDepth);
		super.typeOfWater = typeOfWater;
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Shark(){
		this(34, waterType.saltWater, 0, "Shark" + counter, 3.45, 0.92);
		++counter;
	}
}
