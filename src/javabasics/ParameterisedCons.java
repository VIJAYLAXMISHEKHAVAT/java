package javabasics;

public class ParameterisedCons {
	private int a;
	private int b;
	private String str;
	public ParameterisedCons(){
		System.out.println("I am the default constructor");
	}
	
	public ParameterisedCons(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("I am the parameterised constructor");
	}
	public ParameterisedCons(String str){
		this.str = str;
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//ParameterisedCons pc1=new ParameterisedCons();
		ParameterisedCons pc2=new ParameterisedCons(2,3);
		System.out.println(pc2.a);
		System.out.println(pc2.b);
		ParameterisedCons pc3=new ParameterisedCons("Hello Class!");
		String str5=pc3.str;
		System.out.println(str5);
		
	
	}
}
