package javabasics;
import java.util.Scanner;

public class FindGretestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("Please give first number");
		a = s.nextInt();
		System.out.println("Please give second number");
		b = s.nextInt();
		System.out.println("Please give second number");
		c = s.nextInt();
		
		if (a>b && a>c)
		{
		System.out.println("Greatest number is:  " +a);
		}
		else if (b>a && b>c)
		{
		System.out.println("Greatest number is: " +b);
		}
		else {
		System.out.println("Greatest number is: " +c);		
		}
		s.close();
	}
}