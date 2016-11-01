package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(float normalBodyTemp, float percBodyHair)
	{
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
	public Cow()
	{
		this(34.1f, 87.9f);
	}
}
