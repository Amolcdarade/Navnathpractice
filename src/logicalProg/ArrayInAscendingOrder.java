package logicalProg;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {
		
		int temp;
		int a[] = new int[4];
		   a[0] = 30;
		   a[1] = 40;
		   a[2] = 10;
		   a[3] = 20;
		   
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++)
			   {
				   if(a[i]>a[j])
				   {
					   temp=a[j];
					   a[j]=a[i];
					   a[i]=temp;
				   }
			   }
			   System.out.println(a[i]);
		   }
		}
     }
