package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly(boolean canFly, boolean isDangerous)
	{
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public Butterfly()
	{
		this(true, false);
	}
}
