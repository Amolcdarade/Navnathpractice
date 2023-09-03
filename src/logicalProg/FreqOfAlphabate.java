package logicalProg;

public class FreqOfAlphabate {

	public static void main(String[] args) {
	    String str = "I love Myyyy Country";
		char freq = 'y';
		int counter=0;
	
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==freq)
			{
				counter++;
			}
		}
		  System.out.println("Freq of "+freq+" is = "+counter);
	}
}
