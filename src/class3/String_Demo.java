package class3;

public class String_Demo {

	public static void main(String[] args) {
	
		String[] stringArray = new String[10];

		for(int i=0; i < stringArray.length; i++) {
		    stringArray[i] = "String no " + i;
		}
		for(int i=0; i < stringArray.length; i++) {
	    System.out.println( stringArray[i] );
		}
}

}
