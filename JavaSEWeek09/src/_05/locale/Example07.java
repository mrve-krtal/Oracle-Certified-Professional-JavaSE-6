package _05.locale;

import java.util.Locale;

public class Example07 {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale); // en_TR

		Locale locale2 = new Locale("tr", "TR");
		System.out.println(locale2.getCountry());
		System.out.println(locale2.getDisplayCountry());
		System.out.println(locale2.getLanguage());
		System.out.println(locale2.getDisplayLanguage());
	}
}