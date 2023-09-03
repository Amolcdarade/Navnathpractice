package multipleinheritance;

public class Coldcoffee implements Milk,Coffee,Sugar,Ice,Icecream,Chocolatesyrup{

	public static void main(String[] args) {
		
		Coldcoffee a = new Coldcoffee();
		a.addmilk();
		a.addcoffee();
		a.addsugar();
		a.addice();
		a.addicecream();
		a.addchocalatesyrup();
		
	}
    public void addchocalatesyrup() {
		
		System.out.println("Now add chocolatesyrup in milk");
        System.out.println("Now oue cold coffee is ready");
	}
    public void addicecream() {
		
		System.out.println("Now add icecream in milk");

	}
	public void addice() {
		
		System.out.println("Now add ice in milk");
        System.out.println("Now bleand it properly");
	}
    public void addsugar() {
		
		System.out.println("Now add sugar in milk");

	}
    public void addcoffee() {
		
		System.out.println("Now add coffee in milk");
	}
    public void addmilk() {
		
		System.out.println("Take a glass and add milk in it");
	}
}
