package incapsulation;

public class AccountBalance {
	
	private double balance;
	
	public void setbalance(double balance) {
		this.balance = this.balance + balance;
	}
	
	public double getbalance() {
		return balance;
	}

}
