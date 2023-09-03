package logicalProg;

public class Swapingwithout3rd {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		
		System.out.println("before Swaping"+a+"<========>"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping"+a+"<========>"+b);
	}
  }
