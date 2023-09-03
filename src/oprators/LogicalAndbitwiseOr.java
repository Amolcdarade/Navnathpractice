package oprators;

public class LogicalAndbitwiseOr {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		System.out.println("====Logical OR====");
		 System.out.println(a<b || b<c); // true  true =  true
		 System.out.println(a>b || b>c); // false false=  false
		 
		 
		 System.out.println("====Bitwise OR====");
		 System.out.println(a<b | b<c); // true  true =  true
		 System.out.println(a>b | b>c); // false false=  false
	}

}
