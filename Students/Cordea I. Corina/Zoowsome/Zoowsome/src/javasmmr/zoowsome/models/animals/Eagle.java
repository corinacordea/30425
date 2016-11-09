package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {
	public Eagle(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	public Eagle(){
		this.setName("Eagle");
		this.setNrOfLegs(2);
		this.setMigrates(true);
		this.setAvgFlightAltitude(1234);
	}	
}
