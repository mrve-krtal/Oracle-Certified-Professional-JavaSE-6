package _03.dateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Example04 {

	public static void main(String[] args) throws ParseException {

		DateFormat df = DateFormat.getDateInstance();
		Date date = new Date();

		System.out.println(df.format(date));

		String str = "Feb 25, 2021";

		System.out.println(df.parse(str));

		// parse String -> Date donusum saglar.
		// checked exception throws ParseException

	}
}
