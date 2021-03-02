package _05.locale;

import java.util.Locale;

public class Example06 {

	public static void main(String[] args) {
		
		//Bütün lokasyonlarý almak için  getAvailableLocales()
		Locale[] allLocals = Locale.getAvailableLocales();

		int count = 1;
		for (Locale loc : allLocals) {
			System.out.println(count + " , " + loc);
			count++;
		}

		// standard
		// language_CountryCode
		// language -> kucuk harf
		// Country -> buyuk harf
	}
}

// java.util.Locale