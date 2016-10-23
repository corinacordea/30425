package underworld.utils;

import underworld.utils.Constants;

import java.util.Random;

public class Resources {
	static Random random = new Random();
	
	public static int generateValuableResource() {
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER + 1);
	}
	
	public static int generateResource() {
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER * 2 + 1);
	}
	
}
