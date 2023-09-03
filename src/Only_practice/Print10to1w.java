package Only_practice;

public class Print10to1w {
	
	public void Mymethod(int a)
	{
		if(a>=1)
		{
			System.out.println(a);
			Mymethod(a-1);
		}
	}
     public static void main(String[] args) {
    	 Print10to1w a = new Print10to1w();
    	 a.Mymethod(10);
   	}
}