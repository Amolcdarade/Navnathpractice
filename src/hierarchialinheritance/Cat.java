package hierarchialinheritance;

public class Cat extends Animal{
	public void sound()
	{
		System.out.println("maeao");
	}

	public static void main(String[] args) {
		
		Cat a = new Cat();
		a.sound();
		a.eats();
		a.water();
		

	}

}
