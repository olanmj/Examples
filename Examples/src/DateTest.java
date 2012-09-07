import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author mike
 *
 */
public class DateTest {

	Date d1;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		d1 = new Date(5,6,2012);
	}

	/**
	 * Test method for {@link Date#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsSameDate() {
		Date d2 = new Date(5, 6, 2012);
		assertTrue("Both should be May 6 2012", d1.equals(d2));
		assertTrue("Both should be May 6 2012", d2.equals(d1));
	}
	
	@Test
	public void testEqualsSameObject() {
		assertTrue("Should equal itself", d1.equals(d1));
	}
	
	@Test
	public void testEqualsDifferentMonth() {
		Date d2 = new Date(1, 6, 2012);
		assertFalse("Different month", d1.equals(d2));
		assertFalse("Different month", d2.equals(d1));
	}

	@Test
	public void testEqualsDifferentDay() {
		Date d2 = new Date(5, 1, 2012);
		assertFalse("Different day", d1.equals(d2));
		assertFalse("Different day", d2.equals(d1));
	}
	
	@Test
	public void testEqualsDifferentYear() {
		Date d2 = new Date(5, 6, 2011);
		assertFalse("Different year", d1.equals(d2));
		assertFalse("Different year", d2.equals(d1));
	}
	
	@Test
	public void testEqualsDifferentType() {
		assertFalse("Not a date", d1.equals("abc"));
		assertFalse("Not a date", "abc".equals(d1));
	}
	
}
