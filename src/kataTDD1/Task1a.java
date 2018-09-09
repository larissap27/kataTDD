package kataTDD1;

import org.junit.Test;

public class Task1a {
	
	public int test(int value1, int value2) {
		return value1 + value2 ;

}
	@Test
      public void metod(){
		int value1 = 1;
		int value2 = 2;
		int result = test(value1,value2);
		asserSame(result,3);
	}
	private void asserSame(int result, int i) {
		
		
	}
	
}
