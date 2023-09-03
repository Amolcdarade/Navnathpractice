package logicalProg;

public class AramsstrongNo {

	public static void main(String[] args) {
		
		int num = 153;
		int temp;
		int rev = 0;
		int arms = num;
		while(num>0)
		{
			temp = num%10;
			rev = rev+temp*temp*temp;
			num=num/10;
		}
		System.out.println(rev);
		
		if(rev == arms)
		{System.out.println("It is Armsstrong num");
	}
		else
		{
			System.out.println("Not Aramstrong no");
		}
    }
}