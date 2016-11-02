package javasmmr.zoowsome.models.animals;

public class Fish extends Aquatic{

	public Fish(int avgSwimDepth, waterType typeOfWater)
	{
		this.avgSwimDepth = avgSwimDepth;
		this.typeOfWater = typeOfWater;
	}
	
	public Fish()
	{
		this(5, waterType.freshWater);
	}
}
