package staticDemo;

public class StudentStaticDemo {
	
	int rollno;
	String name;
	static String college = "busyQA";
	
	StudentStaticDemo(int r, String n) {
		rollno=r;
		name=n;
	}
	public void display() {
		System.out.println(rollno+ " " +name+ " "+college);
	}

	public static void main(String[] args) {
		StudentStaticDemo s1=new StudentStaticDemo(111, "Harvinder");
		StudentStaticDemo s2=new StudentStaticDemo(222, "Pawan");
		
		s1.display();
		s2.display();
	}

}
