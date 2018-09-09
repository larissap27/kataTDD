package kataTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void test(){
		int result = StringCalculator.add(null);
		assertEquals(0,result);
				
		int result1 = StringCalculator.add("");
	    assertEquals(0,result1);
				
	    int result2 = StringCalculator.add("1");
		assertEquals(1,result2);
			    
		int result4 = StringCalculator.add("4");
		assertEquals(4,result4);
		
		
	}
	
}
