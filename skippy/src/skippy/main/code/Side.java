package skippy.main.code;

import java.util.Random;

public enum Side {
	EAST, 
	WEST, 
	NORTH, 
	SOUTH;
	
	private static Random random = new Random();
	
	public static Side getRandomDirection() {
        return values()[random.nextInt(values().length)];
	}
}
