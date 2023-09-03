package constructor;

public class Conone {
   
	Conone(int g)
	{
		System.out.println("Navnath sir");
	}
	
	Conone(String s)
	{
		System.out.println("Trupti mam");
	}
	
	public static void main(String[] args) {
		
   Conone c = new Conone(20);
   Conone j = new Conone("abc");
	}

}
