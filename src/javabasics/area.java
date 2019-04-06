package javabasics;
import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		double a, l, b;
		System.out.println("Please give first number");
		l = s.nextDouble();
		System.out.println("Please give second number");
		b = s.nextDouble();
		if (l>0 && b>0)
		{
		a = l*b;
		System.out.println("Result is " +a);
		}
		else
		{
			System.out.println("Wrong input");
		}
		s.close();
	}

}
