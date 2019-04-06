package javabasics;


import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Write a program to input principal, rate of interest and number of years from the user. 
	//Calculate the Simple Interest and the amount of money earned at the end of the term.
	//Simple Interest = 0.01*Principal * number of years * Rate of Interest 
	// Amount = Principal +Simple Interest.

		Scanner s = new Scanner(System.in);
		double p, i, y, a, b;
		System.out.println("Enter principal amount");
		p = s.nextDouble();
		System.out.println("Enter rate of interest");
		i = s.nextDouble();
		System.out.println("Enter number of years");
		y = s.nextDouble();
		a = 0.01*p*i*y;
		b = p + a;
		System.out.println("Simple interest:  " +a);
		System.out.println("Amount:  " +b);
		s.close();
	}

}
