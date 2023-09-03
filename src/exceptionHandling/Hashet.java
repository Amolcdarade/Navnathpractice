package exceptionHandling;

import java.util.HashSet;

public class Hashet {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add("James");
		h.add(100);
		h.add('D');
		h.add(90.3);
		h.add(100);
		h.add(100);
		h.add(null);
		h.add(null);
		
		System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains(100));
        h.remove(null);
        System.out.println(h);
        System.out.println(h.isEmpty());
       h.clear();
       System.out.println(h);






	}

}
