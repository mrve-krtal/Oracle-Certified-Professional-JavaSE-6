package _01.string;

public class Example02 {

	public static void main(String[] args) {
		// String Pool
//
		String x = "java";
		String y = "java";
//
		System.out.println(x == y);

		// Burada 1 tane obje olusur!
		// Compiler 2.objeyi olusturmaz!

		
		String x2 = new String("java"); // her new icin yeni bir obje olusur.
		String y2 = new String("java");

		System.out.println(x2 == y2);
		
		System.out.println(x2.equals(y2));
	}
}
