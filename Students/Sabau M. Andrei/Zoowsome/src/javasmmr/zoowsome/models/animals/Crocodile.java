package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile(boolean laysEggs)
	{
		this.laysEggs = laysEggs;	
	}
	
	public Crocodile()
	{
		this(true);
	}
}
