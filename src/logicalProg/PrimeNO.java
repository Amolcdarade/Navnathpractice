package logicalProg;
public class PrimeNO {
public static void main(String[] args) {
		int num = 6;
		int flag = 0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				flag = 1;
			}
		}
		if( flag == 0)
		{
			System.out.println("It is Prime num");
			
		}
	else
	{
		System.out.println("NOT PRIME");
	}
  }
}