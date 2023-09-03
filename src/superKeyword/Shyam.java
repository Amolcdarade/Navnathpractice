package superKeyword;

public class Shyam extends Ram {
	
	int age = 25;
	
	public void displayAge()
	{
		System.out.println(age);
		System.out.println(super.age);
	}

	public static void main(String[] args) {
		
		Shyam s = new Shyam();
		s.displayAge();
            
	}

}
