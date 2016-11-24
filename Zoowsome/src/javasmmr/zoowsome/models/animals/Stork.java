package javasmmr.zoowsome.models.animals;

public class Stork extends Bird{
	
	public Stork(String name, int legs, boolean migrate, int altitude){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setAvgFlightAltitude(altitude);
		this.setMigrates(migrate);
		
	}
	
	public Stork(){
		this.setName("Stork");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(90);
		this.setMigrates(true);
	}
}
