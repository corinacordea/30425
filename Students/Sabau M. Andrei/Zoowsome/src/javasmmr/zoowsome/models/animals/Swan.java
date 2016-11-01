package javasmmr.zoowsome.models.animals;

public class Swan extends Bird{

	public Swan(boolean migrates, int avgFlightAltitude)
	{
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
		
	}
	
	public Swan()
	{
		this(true, 30);
	}
}
