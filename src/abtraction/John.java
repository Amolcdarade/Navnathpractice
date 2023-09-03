package abtraction;

public class John {
	
	public void toGoToAirportByCab()
	{
		System.out.println("john wants to go to Airport by using car");
		
		Fuel f = new Car();
		f.petrol();
		f.ready();
	}
    public void flyInAeroplane()
    {
    	
	    System.out.println("john now will fly in Aeroplane and reach to uk");
        
	    Aeroplane a = new Aeroplane();
        a.petrol();
        a.ready();
    
    }
  }
