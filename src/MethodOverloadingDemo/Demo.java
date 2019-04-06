package MethodOverloadingDemo;

public class Demo {

	public static void main(String[] args) {
		
		SimpleCalculator obj=new SimpleCalculator();
		
		System.out.println(obj.add(10, 30));
		System.out.println(obj.add(10, 30, 50));
		
	}

}
