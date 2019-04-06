package javabasics;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is the test lenght";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 ="";
		String str5 = "  Spaces are trimmed   ";
		String str6 = "test";
		
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.concat("This is the appended string"));
		System.out.println(str.contains("is"));
		System.out.println(str.contains("not"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("That"));
		System.out.println(str.endsWith("length"));
		
		//Below will be used lot in if condition
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		//indexOf();
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('w'));   //if it doesn't find it returns -
		
		//isEmpty()
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		
		//trim()
		System.out.println(str5.trim());
		
		//replace()
		System.out.println(str6.replace('s', 'm'));
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 10));
		
		char[] charArray = str.toCharArray();
		for(int i =0; i<charArray.length; i++)
		{
			System.out.println("index " +  i + "  is: " + charArray[i]);
		}
 
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		

	}

}
