package skippy.test.code;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import skippy.main.code.Dice;
import skippy.main.code.Point;

public class PointTest {
	Point point =new Point(1, 4);
	Point point1 =  new Point(1,4);
	Dice dice = new Dice();
	@Test
	  public void testEqualsAndHashCode() {
	   assertEquals( new Point( 1, 2 ), new Point( 1, 2 ) );
	   assertNotEquals( new Point( 1, 2 ), new Point( 3, 4 ) );
	   assertEquals(point, point);
	   assertEquals(point, dice);
	   assertEquals( new Point( 1, 2 ), new Point( 1, 2 ) );
 
	  }

	 
	@Test
	  public void testPointCode() {
	   assertNotNull(point);
	  }

	@Test
	  public void testPointhHashCode() {
	   assertNotNull(point.hashCode());
	   assertNotNull(point.toString());
	   
	 
 	  }
	
	 @Test
	public void testSetter_setsProperly() throws NoSuchFieldException, IllegalAccessException {
		// given
		final Point pojo = new Point();

		// when
		pojo.setX(2);
		pojo.setY(2);
		// then
		final Field x = pojo.getClass().getDeclaredField("x");
		final Field y = pojo.getClass().getDeclaredField("y");
		x.setAccessible(true);
		y.setAccessible(true);

		assertEquals("Fields didn't match", x.get(pojo), 2);
		assertEquals("Fields didn't match", y.get(pojo), 2);
	}
	    
	 @Test
	 public void testGetter_getsValue() throws NoSuchFieldException, IllegalAccessException {
	         
	        final Point pojo = new Point();
	        final Field field = pojo.getClass().getDeclaredField("value");
	        field.setAccessible(true);
	        field.set(pojo, 1);
	         
	        final int x = pojo.getX();
	        final int y = pojo.getY();
	      
	        assertEquals("field wasn't retrieved properly", x, 0);
	        assertEquals("field wasn't retrieved properly", y, 8);
	        
	        assertNotNull(pojo.getX());
	        assertNotNull(pojo.getY());

	    }
}
