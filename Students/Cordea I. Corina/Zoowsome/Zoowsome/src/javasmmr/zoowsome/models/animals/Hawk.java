package javasmmr.zoowsome.models.animals;

public class Hawk extends Bird {
	public Hawk(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	public Hawk(){
		this.setName("Hawk");
		this.setNrOfLegs(2);
		this.setMigrates(true);
		this.setAvgFlightAltitude(1234);
	}	
}
