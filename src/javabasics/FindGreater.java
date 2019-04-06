package javabasics;
import java.util.Scanner;

public class FindGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("Please give first number");
		a = s.nextInt();
		System.out.println("Please give second number");
		b = s.nextInt();
		
		
		if (a>b)
		{
			System.out.println("a is greatest that is:  " +a);
		}
		else
		{
		System.out.println("b is greatest that is: " +b);
	}
		s.close();
	}
}

