package skippy.main.code;

import java.util.Scanner;

import org.apache.log4j.Logger;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Kangaroo {
@Getter@Setter
	private Point location;
	 Logger logger = Logger.getLogger("Kangaroo.class");

	 @Getter 
	private int hops;

	public Point move(final Side side) {
		
		final Point nextMove = new Point(location.getX(), location.getY());
		
		switch (side) {
			case SOUTH:
				nextMove.setY(location.getY() - 1);
				break;
			case NORTH:
				nextMove.setY(location.getY() + 1);
				break;
			case WEST:
				nextMove.setX(location.getX() - 1);
				break;
			case EAST:
				nextMove.setX(location.getX() + 1);
				break;
			default: // do nothing
				break;
		}
		return nextMove;
	}

	public void hop(final Grid grid) {
		Point finalDestination = new Point(grid.getDimension(), grid.getDimension());

		Dice d = new Dice();
		
		Point nextPoint;
		
		while (!(atHome(location, finalDestination))) {

			final Side side = d.throwDice();// gets 1 , 2 , 3 ,4 for each

			nextPoint = move(side);

			if (grid.liesOutside(nextPoint))
				logger.info("Oops, hit the boundary: " + nextPoint);
			else {
				hops++;
				logger.info("Hopped to:" + nextPoint);
				location.setX(nextPoint.getX());
				location.setY(nextPoint.getY());
			}

		}
		logger.info("Finished in " + hops + " hops!!");
		logger.info(d.status());
	}

	public static boolean atHome(Point currentPoint, Point homePoint) {
		return currentPoint.equals(homePoint);
	}

 


}
