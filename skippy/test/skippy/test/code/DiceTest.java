package skippy.test.code;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import skippy.main.code.Dice;
import skippy.main.code.Side;

public class DiceTest {
	private Dice dice;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dice = new Dice();
	}

	@After
	public void tearDown() throws Exception {
	}

	// - one time call - it has to return a value from Side
	// - more than one call it does not return the same value always
	// - Check unpredictable randomness of the throwdice method.  
	@Test
	public void testDiceThrow() {
		assertEquals("Random Side ", Side.EAST, dice.throwDice());
 
	}
	
	 
	

}
