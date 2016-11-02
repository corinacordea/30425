package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	public Tiger(float normalBodyTemp, float percBodyHair)
	{
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
	public Tiger()
	{
		this(34.1f, 96.2f);
	}
}
