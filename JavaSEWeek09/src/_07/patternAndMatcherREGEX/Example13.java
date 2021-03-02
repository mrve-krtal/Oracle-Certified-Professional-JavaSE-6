package _07.patternAndMatcherREGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example13 {

	public static void main(String[] args) {

//		String content = "abababa";
//		Pattern p = Pattern.compile("ab");
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}
		
		String content = "abababa";
		Pattern p = Pattern.compile("aba");

		Matcher m = p.matcher(content);

		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
		
		// regex islemi soldan saga dogru olur.
		// kullanilan index tekrar kullanmiyor.
	}
}
