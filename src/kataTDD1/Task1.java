package kataTDD1;

import org.junit.Test;

public class Task1 {
	
	public int test(int value1, int value2,int value3,int value4) {
		return value1 + value2 + value3 + value4;
	}
	
	@Test
	public void metod1(){
		int value1 = 1;
		int value2 = 2;
		int value3 = 3;
		int result = test(value1,value2,value3, 0);
		asserSame(result,6);
	}
	
	public void metod2(){
		int value1 = 1;
		int value2 = 1;
		int value3 = 1;
		int value4 = 1;
		int result = test1(value1,value2,value3,value4);
		asserSame(result,4);
	}
	
	public void metod3(){
		int value1 = 1;
		int value2 = 2;
		int result = test(value1,value2, 0, 0);
		asserSame(result,3);
	}
	
	public void metod4(){
		int value1 = 11;
		int value2 = 22;
		int value3 = 33;
		int result = test(value1,value2,value3, 0);
		asserSame(result,66);
	}

	private int test1(int value1, int value2, int value3, int value4) {
		
		return 0;
	}

	private void asserSame(int result, int i) {
		
		
	}

}
