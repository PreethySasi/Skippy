package skippy.test.code;

import static org.junit.Assert.*;

import org.junit.Test;

import skippy.main.code.Kangaroo;
import skippy.main.code.Point;
import skippy.main.code.Skippy;

public class SkippyTest {
Kangaroo skippy = new Kangaroo();
Point point = new Point(0,0);

	@Test
	public void testMain() {
		skippy.setLocation(point);
		assertNotNull(skippy.getLocation());

		
		
		
	}

}
