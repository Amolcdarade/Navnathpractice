package hierarchialinheritance;

public class Dog extends Animal {
	
	public void sound()
	{
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		
		Dog a = new Dog();
		a.sound();
		a.eats();
		a.water();
		

	}

}
