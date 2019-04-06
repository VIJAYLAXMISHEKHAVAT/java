package class3;

public class CalculatorMethodDemo3 {

	public static void main(String[] args) {
		
		CalculatorMethodDemo3 d=new CalculatorMethodDemo3();
		int x= d.add(5, 7);
		System.out.println(x);
		
		int y= d.add(10, 7);
		System.out.println(y);
		
		System.out.println(d.sub(45, 7));
	}
	public int add(int a, int b) {
		int i=a;
		int j=b;
		int k=i+j;
		return k;
	
	}
	public int sub(int a, int b) {
		int i=a;
		int j=b;
		int k=i-j;
		return k;
	
	}

}
