package controlstatement;

public class Nested_ifelse {

	public static void main(String[] args) {
		 
		int a = -9;
		
		if(a>0)
		{
			System.out.println("Number is positive");
		if(a % 2 == 0)
		{
			System.out.println("Number is Even Number");
		}
		else
		{ System.out.println("Number is odd number");
		
		}
	    }
       else
	    {
	    	System.out.println("Its a negative number");
	    }
	}
}