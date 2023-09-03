package switchstatement;

public class SwitchCase2 {

	public static void main(String[] args) {
	
		int month=76;
		
		switch(month)
		{
		case 1:
             System.out.println("First month is january");
         break;
		case 2:
	         System.out.println("second month is feb");
	         break;
	    case 3:
	         System.out.println("Third month is march");
	         break;
	    case 4:
	         System.out.println("fourth month is April");
	         break;     
	    case 5:
	         System.out.println("Fifth month is may");
	         break;     
	    case 6:
	         System.out.println("sixth month is june");
	         break;
	    case 7:
	         System.out.println("sevnth month is july");
	         break;      
	         default:
	        	 System.out.println("Enter the value between 1 to 7");
		}
	}

}
