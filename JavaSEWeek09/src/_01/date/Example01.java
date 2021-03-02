package _01.date;

import java.util.Date;

public class Example01 {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date);

		// January 1, 1970, 00:00:00 GMT
		// tarihinden bugune gecen milisecond
		long time = date.getTime();
		System.out.println(time);
	}
}

// java.util.Date
// java.util.Calendar

// Artik yeni LocalDate , Java Time/Date API kullanilmasi onerilmektedir.