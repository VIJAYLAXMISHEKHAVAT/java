package javabasics;


import java.util.Scanner;

public class Passorfail {

	public static void main(String[] args) {
		
		System.out.println("Enter the marks of the student");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		if(x<60)
		{
			System.out.println("Sorry you are FAIL");
		}
		else
		{
			System.out.println("Congratulations you are PASS");
		}
		s.close();
	}

}
