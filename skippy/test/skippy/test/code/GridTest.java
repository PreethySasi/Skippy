package skippy.test.code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import skippy.main.code.Grid;
import skippy.main.code.Point;

public class GridTest {
	
	Grid grid;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		grid = new Grid();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_lies_Outside() {
		grid.setDimension(20);
		Point point1 = new Point(19, 19);
		assertEquals("Point is inside the grid returns false when lies out side is invoked", false, grid.liesOutside(point1));
		
		Point point2 = new Point(30, 19);
		assertEquals("Point is inside the grid returns true when lies out side is invoked", false, grid.liesOutside(point2));
	}

}
