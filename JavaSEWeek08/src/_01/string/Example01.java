package _01.string;

public class Example01 {

	public static void main(String[] args) {
		String x = "java";
		x.concat(" Rules");
		System.out.println(x);

		String y = "java";
		y = y.concat(" Rules");
		System.out.println(y);
		
		String z ="java";
		z.toUpperCase();
		System.out.println(z);
	}
}

// java.lang.String
// javada otomatik olarak java.lang paketi import edilir.

// String in her karakteri 16-bit Unicode bir karakterdir.

// String objeleri immutable ozellige sahiptir.
// immutable -> degismez anlamina gelmektedir.