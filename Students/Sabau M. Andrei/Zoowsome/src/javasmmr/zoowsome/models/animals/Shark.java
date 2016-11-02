package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	public Shark(int avgSwimDepth, waterType typeOfWater)
	{
		this.avgSwimDepth = avgSwimDepth;
		this.typeOfWater = typeOfWater;
	}
	
	public Shark()
	{
		this(34, waterType.saltWater);
	}
}
