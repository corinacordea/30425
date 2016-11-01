package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle(boolean migrates, int avgFlightAltitude)
	{
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public Eagle()
	{
		this(true, 50);
	}
}
