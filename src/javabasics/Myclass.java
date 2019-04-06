package javabasics;


public class Myclass {

	public static void main(String[] args) {

		
			int numerator = 5;
			int denominator = 0;
			try
			{
		    int result = numerator/denominator;
			System.out.println(result);
			}
			catch(Exception e)
			{
			System.out.println("An Exception Occurred, Make sure the value for denominator isshould not be zero or minue");
			} 
			
	}
}
