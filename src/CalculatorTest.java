import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAverage() {
		Calculator c=new Calculator();
		c.add(1.0);
		c.add(5.0);
		c.add(90.0);
		c.add(30.0);
		c.add(4.0);
		
		Double result=c.average();
		assertEquals((Double)26.0, result);

		
	}

}
