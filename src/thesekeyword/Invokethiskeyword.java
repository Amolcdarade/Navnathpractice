package thesekeyword;

public class Invokethiskeyword {
	
	public void Fruit()

	{
	    System.out.println("Apple,mango");
	    
	}
	
	public void vegitables()
	{
		
		System.out.println("palak,methi");
		Fruit();
	}
	

	public static void main(String[] args) {
		
		Invokethiskeyword e = new Invokethiskeyword();
		e.vegitables();
	}

}
