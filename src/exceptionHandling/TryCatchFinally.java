package exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am finally block");
		}
	}
}
