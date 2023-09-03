package logicalProg;

public class FibonaciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println(a+" "+b);
		
		while(c<22)
		{
			c = a+b;
			System.out.println(" "+c);
			a = b;
			b = c;
		}
	}
}
