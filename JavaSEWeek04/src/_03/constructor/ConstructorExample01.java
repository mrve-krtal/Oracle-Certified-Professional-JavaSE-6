package _03.constructor;


class Car {
	
}

class Computer {
	
	String brand;
	String model;
	
	Computer(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	Computer() {
	
	}
	
	
}

public class ConstructorExample01 {

	public static void main(String[] args) {
		
		Car car = new Car();
		//javada yeni bir obje olusturmak istedigimizde constructor i cagiririrz!
		
		Computer computer = new Computer("Apple", "Macbook Pro");
		Computer computer2 = new Computer();
		// biz constructor tanimladigimizda java bizim icin no-arg constructor i tanimlamaz.
		// bizim bu constructori tanimlamamiz gerekir!
	}
}
