package staticpackage;

public class StaticKeyNoteDemo {
	
	//Static method cannot use the non-static variable or method directly
	//This and Super cannot be used in static context
	
	public int addNum = 10; //this is a non-static variable
	public static int addNumStatic = 20;
	

	public static void main(String[] args) {
		StaticKeyNoteDemo s1=new StaticKeyNoteDemo();
		int output = s1.sum(20);
		System.out.println("output is: " +output);
		
		int staticOutput= sumStatic(34);
		System.out.println("output is: " +output);
		System.out.println("output is: " +staticOutput);
	}
	
	public int sum(int num) {
		return num +addNum;
	}
	public static int sumStatic(int num) {
		return num +addNumStatic;
	}

}
