package _06.numberFormat;

import java.text.NumberFormat;

public class Example11 {

	public static void main(String[] args) {
		// NumberFormat virgulden sonra 3 hane destekler.

		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		System.out.println(nf.getMinimumFractionDigits());

		int number1 = 100;

		System.out.println(nf.format(number1)); // 100
		
		nf.setMinimumFractionDigits(2);
		
		System.out.println(nf.format(number1)); // 100.00
		
		
		double number2 = 234234.23432423;
		System.out.println(nf.format(number2));
		
		nf.setMaximumFractionDigits(5);
		
		System.out.println(nf.format(number2));
	}
}
