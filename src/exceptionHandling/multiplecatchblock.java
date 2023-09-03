package exceptionHandling;

public class multiplecatchblock {

	public static void main(String[] args) {
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)                    // child
		{
			e.printStackTrace();
			System.out.println("iuytr");
		}
		catch(Exception e)                    // parent 
		{
			e.printStackTrace();
		}
	}
}
