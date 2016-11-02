package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{

	public Spider(boolean canFly, boolean isDangerous)
	{
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public Spider()
	{
		this(false, true);
	}
}
