package _08.tokenizing;

public class Example16 {

	// Token -> simge , sembol
	// buyuk parcalari kucuk parcalara bol!

	// java.lang.String
	// java.lang.StringTokenizer

	public static void main(String[] args) {

		String content = "key1,key2,key3,key4";

		String[] keys = content.split(",");

		for (String key : keys) {
			System.out.println(key);
		}
		
		
		String content2 = "key1,key2:key3;key4,key5.key6";

		String[] keys2 = content2.split(",|:|;|\\."); // virgul , noktali virgul, iki nokta ust usteye gore split et.

		// nokta icin \\. kacis karakterini kullanmamiz gereklidir.
		
		for (String key : keys2) {
			System.out.println(key);
		}
	}
}
