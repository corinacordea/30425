package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{

	private static int counter = 0;
	
	public Spider(boolean canFly, boolean isDangerous, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Spider(){
		this(false, true, 8, "Spider" + counter, 1.23, 0.5);
		++counter;
	}
}
