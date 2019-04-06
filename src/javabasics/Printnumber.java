package javabasics;
import java.util.Scanner;

public class Printnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please give first number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		for(i=2; i<n; i++)
		{
			if(n%i ==0)
			{
			System.out.println("Entered number is not a prime number");
			break;
			}
			else
			System.out.println(+i);
		}
			if (i==n)
			{
				System.out.println("Entered number is a prime number");
			}
			s.close();
	}
	
}
