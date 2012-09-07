import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author mike
 *
 */
public class IncDateTest {

	/**
	 * Test method for {@link IncDate#increment()}.
	 */
	@Test
	public void testIncrement1() {
		IncDate d = new IncDate(9, 10, 2012);
		d.increment();
		assertEquals(new Date(9,11,2012), d);		
	}
	
	@Test
	public void testIncrement2() {
		IncDate d = new IncDate(1, 31, 2012);
		d.increment();
		assertEquals(new Date(2,1,2012), d);		
	}

	@Test
	public void testIncrement3() {
		IncDate d = new IncDate(9, 30, 2012);
		d.increment();
		assertEquals(new Date(10,1,2012), d);		
	}
	
	@Test
	public void testIncrement4() {
		IncDate d = new IncDate(12, 31, 2012);
		d.increment();
		assertEquals(new Date(1,1,2013), d);		
	}
	
	@Test
	public void testIncrement5() {
		IncDate d = new IncDate(2, 28, 2011);
		d.increment();
		assertEquals(new Date(3,1,2011), d);		
	}
	
	@Test
	public void testIncrement6() {
		IncDate d = new IncDate(2, 28, 2012);
		d.increment();
		assertEquals(new Date(2,29,2012), d);		
	}
	
	@Test
	public void testIncrement7() {
		IncDate d = new IncDate(2, 29, 2012);
		d.increment();
		assertEquals(new Date(3,1,2012), d);		
	}
}
