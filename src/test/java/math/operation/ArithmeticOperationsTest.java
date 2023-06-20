package math.operation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class ArithmeticOperationsTest {

	@Test
	void testAdd()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);	
	}

}
