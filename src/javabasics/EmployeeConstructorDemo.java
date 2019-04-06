package javabasics;

public class EmployeeConstructorDemo {

	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setFirstName("Naresh");
		System.out.println(e1.getFirstName());
		
		System.out.println(e1.salary);
		System.out.println(e1.deptCode);
		
		Employee e2=new Employee(20000, 2);
		System.out.println(e2.salary);
		System.out.println(e2.deptCode);
		
	}

}
