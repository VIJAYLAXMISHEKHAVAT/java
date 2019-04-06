package DemoInterface;

public class Develop implements BankingClient {

	public static void main(String[] args) {

		Develop d1=new Develop();
		d1.payBalanceTransfer();
		d1.payCreditCard();
		d1.payDebitCard();
		d1.login();
		
		BankingClient d2=new Develop();
		d2.payBalanceTransfer();
		d2.payCreditCard();
		d2.payDebitCard();
		
	}

	@Override
	public void payCreditCard() {
		System.out.println("Paid Credit Card");
	}

	@Override
	public void payDebitCard() {
		System.out.println("Paid Debit Card");
		
	}

	@Override
	public void payBalanceTransfer() {
		System.out.println("Balance Transfer Successful");
		
	}
	
	public void login() {
		System.out.println("I am Logged in");
	}

}
