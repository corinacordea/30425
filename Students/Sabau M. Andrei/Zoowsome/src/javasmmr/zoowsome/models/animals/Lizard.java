package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(boolean laysEggs)
	{
		this.laysEggs = laysEggs;
	}
	
	public Lizard()
	{
		this(true);
	}
}

