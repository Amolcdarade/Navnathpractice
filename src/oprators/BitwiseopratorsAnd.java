package oprators;

public class BitwiseopratorsAnd {

	public static void main(String[] args) {
        System.out.println("==========logic And=============");

		int a= 30;
		int b=40;
        System.out.println(a>b  && b<a);
        System.out.println(b<a && a>b);

        
        System.out.println("===========Bitwise And==================");
        int t=60;
        int u= 70;
        
        System.out.println(t>u & u<t);
        System.out.println(u<t & t>u);


        

	}

}
