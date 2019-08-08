/**
 * 
 */
package skippy.test.code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import skippy.main.code.Grid;
import skippy.main.code.Kangaroo;
import skippy.main.code.Point;

/**
 * @author sasip
 *
 */
public class KangarooTest {
Kangaroo kangaroo;
Grid grid;
Point point,homePoint;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		point =new Point(32,32);
 		homePoint =new Point(32,32);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
 

    @Test
	public void test_hop() {
		 kangaroo.hop(grid);
	} 	
	

	@Test
	public void test_atHome() {
		 assertTrue(kangaroo.atHome(point, homePoint));
	}

}
