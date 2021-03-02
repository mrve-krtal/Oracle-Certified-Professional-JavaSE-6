package _04.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example05 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat();
		Date date = new Date();

		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf2.format(date));

		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(sdf3.format(date));

		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		System.out.println(sdf4.format(date));

		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy E HH:mm:ss.SSS a Z");
		System.out.println(sdf5.format(date));

		// kucuk buyuk harf FARKI VAR!!!! DIKKAT
		// https://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html
	}
}
