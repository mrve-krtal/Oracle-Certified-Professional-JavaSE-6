package _01.exception.handling;

public class Example01 {

	public static void main(String[] args) {

		int number = 100;

//		System.out.println(number / 0); //program crash olur!
//		System.out.println("not work!");

		try {
			System.out.println(number / 0);
			System.out.println("not work");
		} catch (ArithmeticException e) {
			// firlatilan hatanin ya kendisi ya super tipi olmalidir.
			// yoksa catch bloguna dusmez!
			System.out.println("exception caught!");
		}
		
		// try blogunda bir exception ortaya ciktiginda , catch blogunda yakalanirsa program calismaya devam eder. //crash olmaz
		//
		
		try {
			System.out.println(number / 0);
			System.out.println("not work2");
		} catch (RuntimeException e) {
			// firlatilan hatanin ya kendisi ya super tipi olmalidir.
			// yoksa catch bloguna dusmez!
			// public class ArithmeticException extends RuntimeException 
			System.out.println("exception caught2!");
		}

	}
}