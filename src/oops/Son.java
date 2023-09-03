package oops;

public class Son extends Father{
	
	public void job()
	{
		System.out.println("son has own job");
	}

	public void bike()
	{
		System.out.println("son has own bike");
	}
	public static void main(String[] args) {
		
		Son b = new Son();
		b.job();
		b.bike();
		b.farm();
		b.home();

	}

}
