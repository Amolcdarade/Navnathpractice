package constructor;

public class Paracons {
	
	Paracons(int a)
	{
		System.out.println("I am in parametarise constructor");
		
	
	}
	Paracons(int b , int m)
	{
	
		System.out.println("I am in non parameterise constructor");
	
	}

	
	public static void main(String[] args) {
		new Paracons(30);
		new Paracons(40,50);
	

	}

}
