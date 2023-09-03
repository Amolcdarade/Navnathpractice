package thesekeyword;

       public class Thiskeyword 
{
	int a;

       public void mymethod(int a)
{
       System.out.println(a);
       this.a=a;
       System.out.println(a);

}
       public void Display()
{
       System.out.println(a);
}

public static void main(String[] args) {

     Thiskeyword d = new Thiskeyword();
       d.mymethod(50);
       d.Display();
}

}


