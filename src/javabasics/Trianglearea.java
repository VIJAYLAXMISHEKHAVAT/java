package javabasics;


import java.util.Scanner;

public class Trianglearea {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		double a, b, h;
		System.out.println("Please give first number");
		b = s.nextDouble();
		System.out.println("Please give second number");
		h = s.nextDouble();
		if (b>0 && h>0)
		{
		a = (b*h)*0.5;
		System.out.println("Result is " +a);
		}
		else
		{
			System.out.println("Wrong input");
		}
		s.close();
	}

}
