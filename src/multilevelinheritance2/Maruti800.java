package multilevelinheritance2;

public class Maruti800 extends Maruti {
	
	public void maruti800()
	{
		System.out.println("maruti model:800");
	}
	
	public void speed()
	{
		System.out.println("max : 80kmph");
	}

	public static void main(String[] args) {
		
		Maruti800 c = new Maruti800();
		c.maruti800();
		c.speed();
		c.maruti();
		c.brand();
		c.speed();
		c.vehicleType();
		c.car();
		
		

	}

}
