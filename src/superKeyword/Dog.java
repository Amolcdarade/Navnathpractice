package superKeyword;

public class Dog extends Animal{
	
	public void eat()
	{
		super.eat();
		System.out.println("Dog eat chiken Happly");
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		

	}

}
