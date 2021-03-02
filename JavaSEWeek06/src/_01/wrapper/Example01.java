package _01.wrapper;

public class Example01 {

	public static void main(String[] args) {

		Integer number1 = 10;
		Integer number2 = 10;

		Integer number3 = 1000;
		Integer number4 = 1000;

		//
		System.out.println(number1 == number2);
		System.out.println(number3 == number4);
		//
		// == kontrolu , referecen type degisken icin bu 2 degisken ayni objeyi mi gosteriyor?
		// evet se true
		// hayirsa false
		
		System.out.println("equals check");
		System.out.println(number1.equals(number2));
		System.out.println(number3.equals(number4));
		
		//
		
	}
}
