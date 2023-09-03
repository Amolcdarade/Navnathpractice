package Only_practice;

public class ReverseNo {

	public static void main(String[] args) {
		
		int num = 123456;
		int temp;
		int rev = 0;
		
		while(num>0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
           System.out.println(rev);
	}

}
