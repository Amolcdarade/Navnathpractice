package exceptionHandling;

import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		
		LinkedList a = new LinkedList();
		
		a.add(500);
		a.add("abcd");
		a.add('w');
		a.add(1030);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(2));
		System.out.println("xyz");
		System.out.println(a);
		a.remove(4);
		System.out.println(a.contains("xyz"));
		System.out.println(a.isEmpty());
                           a.clear();
        System.out.println(a);

	}

}
