package string_manipulation;

public class Demo {

	public static void main(String[] args) {
		
		String s1 = "pEter Parkar ";
		String s2 = "peter parkar";
		String s3 = "Automation Tester";
		
		char c = s1.charAt(4);
		System.out.println(c);
		
		System.out.println(s1.endsWith("kar"));
		System.out.println(s1.startsWith("pEte"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf("r"));
		System.out.println(s1.lastIndexOf("r"));
		System.out.println(s1.concat(s3));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		System.out.println(s1.replace("pEter","Spidarman"));
	}
 }
