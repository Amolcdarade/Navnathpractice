package logicalprogExtra;

public class Palondromnumber {

	public static void main(String[] args) {
		int rev=0;
		int temp;
		int num=123;
		int pal=num;
		while(num>0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
          if(pal==rev)
          {
        	  System.out.println("It is palandrom Number");
          }
          else
          {
        	  System.out.println("It is not Palandrom number");
          }
	}
}
