package controlstatement;

public class Ifelseif {

	public static void main(String[] args) {
		
	int	money = 250;
	
	if(money > 3000 && money < 9999)
	{
		System.out.println("I will buy a smart watch");
	
	}
	else if(money > 10000 && money < 19999)
	{
		System.out.println("I will buy a Smart Phone");
	}
	
	else if(money > 20000 && money < 29999)
	{
		System.out.println("I will bye a laptop");
		
	}
	
	else
	{
	   System.out.println("I will not buy Anything");
	}

	}
}