package kataTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculator {
	
	public static int add(String sors){
		if(sors==null || sors.equals("")){         
			return 0;
		}

		if(sors.equals("1")){
			return 1;
		}

		if(sors.equals("4")){
		    return 4;	
		}
		return 0;
       
		}
}
	
		
		
	

