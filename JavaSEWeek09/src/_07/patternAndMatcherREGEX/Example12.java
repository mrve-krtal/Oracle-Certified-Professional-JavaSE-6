package _07.patternAndMatcherREGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example12 {

	public static void main(String[] args) {

//		String content = "java";
//		Pattern p = Pattern.compile("v");
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}

//		String content = "injavawetrust";
//		Pattern p = Pattern.compile("t");
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}

//		String content = "injavawetrust";
//		Pattern p = Pattern.compile("vaw");
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}

//		String content = "injavawetrust";
//		Pattern p = Pattern.compile("ja|e|u"); // | -> or veya
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}

//		String content = "injavawetrust";
//		Pattern p = Pattern.compile("[jwt]"); // j|w|t
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}

//		String content = "injavawetrust";
//		Pattern p = Pattern.compile("[jwt][er]"); // j|w|t
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}
//		
//		String content = "injavawetrust";
//		Pattern p = Pattern.compile("[a-e]"); // a|b|c|d|e
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}

//		String content = "71426";
//		Pattern p = Pattern.compile("[2-6]"); // a|b|c|d|e
//
//		Matcher m = p.matcher(content);
//
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//		}
		
		String content = "injavawetrust";
		Pattern p = Pattern.compile("[^ajt]s"); // carat isareti ; bunlarin disinda anlamina gelir.

		Matcher m = p.matcher(content);

		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}
}

// reqex -> regular expression

// java.util.regex.Matcher
// java.util.regex.Pattern