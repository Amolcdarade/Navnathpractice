package constructor;

public class Practice {
	
	Practice()
	{
		System.out.println("Good morning to All");
	}
	Practice(int a)
	{
       System.out.println("Have a great day");
	}
	public static void main(String[] args) 
	{
	
		Practice a = new Practice();
		Practice b = new Practice(40);

	}

}
