package underworld.utils;

import java.util.Random;

public class Resourses {
	private static Random random = new Random();
	public static int generateResourse(){
		int number = 0;
		number = random.nextInt((Constants.MAP_RESOURCES_NUMBER+1));
		return number;
	}
	
	public static int generateValuableResourse(){
		int number;
		number = random.nextInt((Constants.MAP_RESOURCES_NUMBER+1)*2);
		return number;
	}
}
