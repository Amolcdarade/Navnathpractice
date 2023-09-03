package exceptionHandling;

public class MethodToPrintException {

	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 0;
			int c = a/b;
		}
		catch(Exception e)
		{
			e.printStackTrace();                  // exception,Description,stacktrace
			
			System.out.println("=====");
			System.out.println(e);                  //exception,Discription
			System.out.println("=====");
            System.out.println(e.getMessage());     // Discrption 
		}

	}

}
