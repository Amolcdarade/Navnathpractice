package switchstatement;

public class Switch {

	public static void main(String[] args) {
		int day=6;
		
		switch(day)
		{
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tue");
			break;
		case 3:
			System.out.println("Today is wed");
			break;
		case 4:
			System.out.println("Today is Thr");
			break;
		case 5:
			System.out.println("Today is Fri");
			break;
		case 6:
			System.out.println("Today is Sat");
			break;
		case 7:
			System.out.println("Today is Sun");
			break;
			
			default :
				System.out.println("Enter between 1 to 7");
		}
		

	}

}
