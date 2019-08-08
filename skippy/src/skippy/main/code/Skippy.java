package skippy.main.code;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Skippy {

	public static void main(String[] args) {
		 Logger logger = Logger.getLogger("Skippy.class");
		 BasicConfigurator.configure();
		Kangaroo skippy = new Kangaroo();

		Point location = new Point(0, 0);
		skippy.setLocation(location);
		Scanner scanner = new Scanner(System.in);
		int dimension;
		logger.info("Enter dimension of the Grid (>=1):");
		do {
			while (!scanner.hasNextInt()) {
				logger.info("Invalid dimension! Try again");
				scanner.next();
			}
			dimension = scanner.nextInt();
			if (dimension < 1)
				logger.info("Provide valid dimension value");

		} while (dimension < 1);
		logger.info(" Grid Dimension is (" + (dimension - 1) + "," + (dimension - 1) + ")");

		if (dimension >= 1) {
			Grid grid = new Grid(); // private field
			grid.setDimension(dimension - 1);
			skippy.hop(grid);
		} else {
			logger.info("invlid Grid dimension , Provide value >=1 . ");
		}

		scanner.close();

	}

}
