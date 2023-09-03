package polymorphism;

public class Practice2 extends Practice1 {
	
	public void display()
	{
		System.out.println("I am in class 2");
	}


	public static void main(String[] args) {
		
		Practice1 a= new Practice1();
		a.display();
		
		

	}

}