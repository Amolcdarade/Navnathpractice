package Only_practice;

public class Swaping3Variables {

	public static void main(String[] args) {
		
		int a=30;
		int b=60;
		int c;
		
		System.out.println("Before Swaping"+a+"<==============>"+b);
		
		c=a+b;
		c=b;
		b=a;
		a=c;
		
		System.out.println("After Swaping"+a+"<==============>"+b);

	}

}
