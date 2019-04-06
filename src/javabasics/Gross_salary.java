package javabasics;


import java.util.Scanner;

public class Gross_salary {


	public static void main(String[] args) 
	{
		
		//Write a Java program to input basic salary for an employee.  Calculate 
		//DA = 10% of the Basic Salary
		//HRA = 5% of the Basic Salary
		//Tax=13% of the Basic Salary
		//Calculate the gross salary of the employee. (note: gross salary is DA + HRA + Tax)
	
		Double d, h, t, g;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your basic annual Salary  :");
		Double x=S.nextDouble();
		d=x*0.10;
		System.out.println("Your DA is  :" +d);
		h=x*0.05;
		System.out.println("Your HRA is  :" +h);
		t=x*0.13;
		System.out.println("Your TAX is  :" +t);
		g = x+d+h+t;
		System.out.println("Gorss annual Salary is  :" +g);
		S.close();
	}

}
