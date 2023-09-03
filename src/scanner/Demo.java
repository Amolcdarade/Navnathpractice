package scanner;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = a+b;
		System.out.println(c);
		
		String str = s1.next();
		System.out.println(str);

	}

}
