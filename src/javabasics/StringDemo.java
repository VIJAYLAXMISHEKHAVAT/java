package javabasics;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String literal - String constant pool 
		//Hello is an object, str1 is reference to an object
		String str1= "Hello";
		
		//String Constant pool is smart - in below case, this will not create new Hello object but it will create new reference str3
		String str3 = "Hello";
		System.out.println(str3);
		// String object - Heap memory
		String str2 = new String("Welcome");
		System.out.println(str2);
		
		String str4 = new String("Welcome");
		System.out.println(str4);
		//Strings are immutable - in below example we are not modifying the string, it creates a new object but str1 is having the new reference
		
		
		str1= "Hello one";
		
		String stradd = str1 + str2;
		System.out.println(stradd);

	}

}
