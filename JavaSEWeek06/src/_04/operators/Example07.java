package _04.operators;

public class Example07 {

	public static void main(String[] args) {

		int number = 10;
		number += 20; // number = number + 20;

		System.out.println(number);

		int x = 3;
		x *= 2 + 5;

		// x = x+2*5 Degil 
		// x = x *(2+5) mantiginda calisir

		System.out.println(x);
	}
}
