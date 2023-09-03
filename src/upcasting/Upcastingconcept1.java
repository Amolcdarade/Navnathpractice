package upcasting;

public class Upcastingconcept1 {

	public static void main(String[] args) {
		
		Animal a = new Shark();
		a.nature();  //upcasting
		
		// Shark s = new Shark();//consrtuctor we never write parent
		Shark s = (Shark)a;//downcasting
			s.nature();
	}
 }
