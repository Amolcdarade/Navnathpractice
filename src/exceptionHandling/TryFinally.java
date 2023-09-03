package exceptionHandling;

public class TryFinally {

	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 0;
			int c = a/b;
		}
		finally
		{
			System.out.println("I am finally block");
		}

	}

}
