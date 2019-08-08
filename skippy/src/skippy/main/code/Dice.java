package skippy.main.code;

import java.util.Hashtable;
import java.util.Map;

import org.apache.log4j.Logger;
 

public class Dice {
	 Logger logger = Logger.getLogger("Dice.class");
	 private int totalThrows;
	private static final int NO_COUNT = 0;
	private Map<Side, Integer> throwCountMap = new Hashtable<Side, Integer>();
 	public Side throwDice() {
		final Side side = Side.getRandomDirection();
		if (throwCountMap.containsKey(side)) {
			int currentCount = throwCountMap.get(side);
			throwCountMap.put(side, ++currentCount);
		} else {
			throwCountMap.put(side, 1);
		}
		totalThrows++;
		return side;
	}

	/**
	 * Returns the status of the throws so far.
	 * 
	 * @return - A map describing the per
	 */
	public Map<Side, Integer> status() {
 		logger.info("Die statistics:");
 		logger.info("Total # throws:" + totalThrows);

		for (Side side : Side.values()) {
			if (throwCountMap.containsKey(side)) {
				logger.info(side + " : " + calculatePercentageOfThrows(throwCountMap.get(side)));
			} else {
				logger.info(side + " : " + calculatePercentageOfThrows(NO_COUNT));
			}
		}

		return throwCountMap;
	}

	private double calculatePercentageOfThrows(final int throwCount) {
		return totalThrows > 0 ? ((double) throwCount / totalThrows) * 100 : 0;
	}
}
