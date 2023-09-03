package polymorphism;

public class Demo {
	
	public void show(int a)
	{
		System.out.println("class 1");
	}
	
	public void show(int a,int b)
	{
		System.out.println("class 2");
	}
	
	public void show(String sd)
	{
		System.out.println("class 3");
	}

	public static void main(String[] args) {
		
  Demo e = new Demo();
  e.show(1);
  e.show(5, 6);
  e.show("amol");
	}

}
