package multilevelinheritance;

public class Whatsappversion3 extends  Whatsappversion2  {
	
	public void payment()
	{
		System.out.println("User can make Payment");
	}

	public static void main(String[] args) {
		
		 Whatsappversion3 a = new  Whatsappversion3 ();
		 a.payment();
		 a.calling();
		 a.status();
		 a.sendmessage();
		 a.saveDp();
		

	}

}
