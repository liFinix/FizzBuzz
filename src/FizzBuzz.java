package TDD;

import java.util.Scanner;
public class FizzBuzz {
	
public static String getint(int kb) {
		
		String result = "";
		
		if(kb%5==0 && kb%3==0) 
		{
			result = "FizzBuzz";
		}
		else if(kb%3==0) 
		{
			result = "Fizz";
		}
		else if(kb%5==0)
		{
			result = "Buzz";
		}
		else
		{
			return String.valueOf(kb);
		}
		
		return result;
	}

}
