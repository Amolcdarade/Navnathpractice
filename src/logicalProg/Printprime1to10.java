package logicalProg;

public class Printprime1to10 {

	public static void main(String[] args) {
		
		int flag=0;
		for(int i=2; i<=10; i++)
		{
			for(int k=2; k<i; k++)
			{
				if(i%k == 0)
				{
					flag=1;
				}
			}
			if(flag == 0)
			{
				System.out.println(i+"It is Prime");
			}
			else
			{
				flag=0;
			}
		}
	}
}