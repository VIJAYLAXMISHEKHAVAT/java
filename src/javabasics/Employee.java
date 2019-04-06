package javabasics;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	int salary;
	int deptCode;
	
	//constructor used to initialize the value of instance variable
	public Employee() {
		salary = 0;
		deptCode = 1;
		System.out.println("Executing constructor without argument");
	}
	public Employee(int salary, int deptCode) {
		this.salary = salary;
		this.deptCode = deptCode;
		System.out.println("Executing constructor with argument");
	}
	public void setFirstName(String firstName) {
		//"this" refers to the instance of the class(object)
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
