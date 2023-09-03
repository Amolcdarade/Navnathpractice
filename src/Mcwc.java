
public class Mcwc {

	public static void fun1()
	{
  System.out.println("I am in static method fun1");	
	}
	public void fun2()
	{ 
		System.out.println("am in non static method fun2" );
	}
	public static void main(String[] args) {
		
		Mcwc a = new Mcwc();
		a.fun2();
		Mcwc.fun1();
	}

}
