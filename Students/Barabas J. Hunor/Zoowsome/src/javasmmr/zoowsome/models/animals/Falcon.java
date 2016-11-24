package javasmmr.zoowsome.models.animals;

public class Falcon extends Bird {

	public Falcon(String name, int legs, boolean migrate, int altitude){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setAvgFlightAltitude(altitude);
		this.setMigrates(migrate);
		
	}
	
	public Falcon(){
		this.setName("Falcon");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(180);
		this.setMigrates(false);
	}
}
