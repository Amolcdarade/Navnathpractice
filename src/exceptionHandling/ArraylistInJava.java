package exceptionHandling;

import java.util.ArrayList;

public class ArraylistInJava {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
       
		al.add(100);
		al.add("abc");
		al.add('D');
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.set(1, "xyz"));
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.contains("xyz"));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al);
		
		
		
	}

}
