package polymorphism;

public class Icecream extends Panipuri {
	
	public void eats()
	{
		System.out.println("I want to eat Icecream");
	}

	public static void main(String[] args) {
		
		Panipuri  a = new Panipuri ();
		 a.eats();
		 
		 Icecream  d = new Icecream();
		 d.eats();
		

	}

}
