
package javabasics;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Please enter number");
		a = s.nextInt();
		
		b = a%2;
		
		if (b==0)
			
		{
			System.out.println(a + "  is a Even number");
		}
		
		else
			
		{
		System.out.println(a + "  is a Odd number");
		}
		s.close();
	}
	
	}
