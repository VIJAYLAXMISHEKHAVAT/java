package javabasics;


import java.util.Scanner;

public class Numbercheck {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		if(x<0)
		{
			System.out.println("Number entered is NEGATIVE");
		}
		else if(x==0)
		{
			System.out.println("Number entered is ZERO");
		}
		else 
		{
			System.out.println("Number entered is POSITIVE");
		}
		s.close();
	}
}
