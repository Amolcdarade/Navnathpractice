package controlstatement;

public class Nested_if {

	public static void main(String[] args) {
		
		System.out.println("Blood Donation Camp");
		
		int age=35;
		int weight = 45;
		
    if(age >=40)
    {
    	System.out.println("Age is valid");
    
     if(weight > 45)
     {
    	 System.out.println("Weight is valid");
     }
	
    }
    else
    {
    	System.out.println("Should not donate the blood");
    }
    
	}
}
