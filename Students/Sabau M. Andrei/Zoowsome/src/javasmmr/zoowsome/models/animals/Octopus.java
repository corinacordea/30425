package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic{

	public Octopus(int avgSwimDepth, waterType typeOfWater)
	{
		this.avgSwimDepth = avgSwimDepth;
		this.typeOfWater = typeOfWater;
	}
	
	public Octopus()
	{
		this(43, waterType.saltWater);
	}
}
