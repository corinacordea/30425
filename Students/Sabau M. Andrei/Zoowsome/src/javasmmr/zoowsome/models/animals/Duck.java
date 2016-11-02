package javasmmr.zoowsome.models.animals;

public class Duck extends Bird{

	public Duck(boolean migrates, int avgFlightAltitude)
	{
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public Duck()
	{
		this(false, 20);
	}
}
