package _01.string;

public class Example03 {

	public static void main(String[] args) {

		String lang1 = "java8";

		String version = "8";
		String lang2 = "java" + version;

		System.out.println(lang1.intern() == lang2.intern());

		// All literal strings and string-valued constant expressions are interned.

		String lang11 = "java8";

		final String version2 = "8"; // degisken final oldugunda constant oldugu icin true doner.
		String lang22 = "java" + version2;

		System.out.println(lang11 == lang22);

		// String OBJELERINI equals ile karsilastir!!!
		
	
	}
}
