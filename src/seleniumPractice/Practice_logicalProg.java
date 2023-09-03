package seleniumPractice;

public class Practice_logicalProg {

	public static void main(String[] args) {
	  
		int num=153;
		int temp;
		int rev=0;
		int arms=num;
		while(num>0)
		{
			temp=num%10;
			rev=rev+temp*temp*temp;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==arms)
		{
			System.out.println("It is arms number");
		}
		else
		{
			System.out.println("It is not Arms number");
		}
		
	}
}
