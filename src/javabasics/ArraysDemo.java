package javabasics;

import java.util.*;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//declare an array
		int[] myIntArray; 
		//create an array
		myIntArray = new int[10];
		//input values in array
		myIntArray[0] = 100;
		myIntArray[1] = 30;
		System.out.println(myIntArray[0]);
		System.out.println(myIntArray[1]);
		System.out.println(myIntArray[2]);
		
		int len1 = myIntArray.length;
		System.out.println("Int Array Length: " +len1);
		String[] myStrArray = {"QA", "Dev", "Ops"};
		System.out.println(myStrArray[0]);
		System.out.println(myStrArray[1]);
		System.out.println(myStrArray[2]);
		int len2 = myStrArray.length;
		System.out.println("String Array Lenght: " +len2);
		
		for(int i=0; i<len1; i++) {
			System.out.println(myIntArray[i]);
		}
		Arrays.sort(myIntArray);
		
		for(int i=0; i<len1; i++) {
			System.out.println(myIntArray[i]);
		}
	}

}
