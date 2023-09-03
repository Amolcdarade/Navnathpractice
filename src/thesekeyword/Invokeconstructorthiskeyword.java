package thesekeyword;

public class Invokeconstructorthiskeyword {
	
	Invokeconstructorthiskeyword()
	{
		
		System.out.println("Sagar");
		
	}
	 
	Invokeconstructorthiskeyword(int a)
	{
		this();

		System.out.println("Amol");


	}

	public static void main(String[] args) {
		
		new Invokeconstructorthiskeyword(80);
		

	}

}
