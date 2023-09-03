package conversion;

public class Expliitcasting {

	public static void main(String[] args) {
		
		int i=100000;
		int b=(short)i;
		System.out.println(b);
		
		float a=57.99f;
		short s =(short)a;
		System.out.println(s);
		
		double d=4545454;
		float f=(float)d;
		System.out.println(f);
		
		long z=12345;
		float x=(float)z;
		System.out.println(x);
	}
}
