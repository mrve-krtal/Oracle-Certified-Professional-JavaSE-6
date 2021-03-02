package _02.calendar;

import java.util.Calendar;

public class Example02 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		//
		System.out.println(calendar.get(1)); // magic number! bu tarz programlama YAPMA!
		System.out.println(calendar.get(Calendar.YEAR)); // public static final int YEAR = 1; // Dogru yaklasim

		System.out.println(calendar.get(Calendar.MONTH)); // Aylar 0 dan baslar!!
		//bu da eski date apide olan bir kotu ozellik.
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		//
		
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		
		//
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.YEAR, 2);
		calendar2.add(Calendar.MONTH, 6);
		System.out.println(calendar2);
	}
}

// java.util.Calendar abstract siniftir.
// 