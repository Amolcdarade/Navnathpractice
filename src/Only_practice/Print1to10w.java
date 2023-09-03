package Only_practice;

public class Print1to10w {
	
	public void mymethod(int a)
 {
	if(a<=10)
    {
		System.out.println(a);
		mymethod(a+1);
	}
 }
	public static void main(String[] args) {
		
		Print1to10w a = new Print1to10w();
		a.mymethod(1);
		
		

	}

}
