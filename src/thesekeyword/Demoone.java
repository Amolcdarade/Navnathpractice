package thesekeyword;

public class Demoone {
	int a;
	    
	public void mymethod(int c)
	{
	 System.out.println(c);
	 a=c;
	 System.out.println(a);
	
	}
	 public void Display()
	 {
	   System.out.println(a);
	 }
	
	public static void main(String[] args) {
	
Demoone d = new Demoone();
   d.mymethod(50);
   d.Display();
	}

}
