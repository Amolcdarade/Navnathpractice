package mypratic;

public class Nstatic {
	public static void myMethod()
	{
		System.out.println("I am in non static method");
	}
	public static void main(String[] args) {
		Nstatic a = new Nstatic();
		a.myMethod();

	}

}
