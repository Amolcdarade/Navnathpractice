package logicalProg;

public class HigestAndLowestArray {

	public static void main(String[] args) {
	
		int high;
		int low;
		int num;
		
		int a[] = new int[4];
		a[0] = 30;
		a[1] = 40;
		a[2] = 10;
		a[3] = 20;
		
		high = a[0];
		 low = a[0];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 num=a[i];
			 if(num>high)
			 {
				 high=num;
			 }
			 if(num<high)
			 {
				 low=num;
			 }
		 }
		 System.out.println(high+"<----->"+low);
     }
  }
