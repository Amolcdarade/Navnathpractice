package abcpractice;

public class Star {
	
	public void Mymethod(int a)
	{
		if(a>=1)
		{
			System.out.println(a);
			Mymethod(a-1);
		}
	}
	
	public static void main(String[] args) {
		
		Star a = new Star();
		a.Mymethod(10);
  }
}
