package methodoverridingDemo;

public class Demo1 extends ABC {

	
	public void display() {
		System.out.println("display() method from a child class");
	}
	
	public void newMethod() {
		System.out.println("newMethod() from a child class");
	}
	public static void main(String[] args) {
		
		ABC obj1 = new ABC();
		obj1.display();
		
		Demo1 obj2 = new Demo1();
		obj2.display();
		obj2.newMethod();
		
		ABC obj3 = new Demo1();
		obj3.display();
		
		
		

		
	}

}
