package incapsulation;

public class UpdateAndChecBalance {

	public static void main(String[] args) {
		
		AccountBalance a = new AccountBalance();
		System.out.println(a.getbalance());
		a.setbalance(11000.50);
		System.out.println(a.getbalance());
		a.setbalance(110);
		System.out.println(a.getbalance());
   }
}
