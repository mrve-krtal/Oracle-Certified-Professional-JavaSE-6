package _04.operators;

public class Example09 {

	public static void main(String[] args) {

		Ford ford = new Ford();

		System.out.println(ford instanceof Car);
		System.out.println(ford instanceof Ford);
		System.out.println(ford instanceof Speedy);
		// System.out.println( ford instanceof Honda);
	}
}

class Car {

}

class Ford extends Car implements Speedy {

}

class Honda extends Car {

}

interface Speedy {

}