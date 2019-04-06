package InterfaceDemo;

public class Develop implements BankingClient{

	public static void main(String[] args) {
		
	Develop d=new Develop();
	d.login();
	d.paycreditcard();

	
	
	}
	
	public void login() {
		System.out.println("login successful");
	}

	@Override
	public void paymortgage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paydebitcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paylineofcredit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paytaxes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payinsurance() {
		// TODO Auto-generated method stub
		
	}

}
