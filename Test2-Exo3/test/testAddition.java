import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testAddition {
	RomanAdditionner calcul;
	@Before
	 public void setUp() throws Exception {
		
	 }
	
	
	 @After
	 public void tearDown() throws Exception {
	 }

	@Test
	public void testAddition() {
		assertEquals("CC",calcul.compute("C", "+", "M"));
	}
	
	

}
