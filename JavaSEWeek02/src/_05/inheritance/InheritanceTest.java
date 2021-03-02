package _05.inheritance;

public class InheritanceTest {

}

abstract class Car {

	public abstract String getBrand();
	
	public abstract int getPrice();

	// bu metotlar kalitim/extends vasitasiyla kulllanilabilir.
	// boylelikle BMW , Mercedes ,,, siniflar icin yazmamis oluruz.
	// code duplication onlendi!
	
	public void drive() {
		System.out.println("drive....");
	}

	public void stop() {
		System.out.println("stop....");
	}

	public int door() {
		return 5;
	}

}

class BMW extends Car {

	@Override
	public String getBrand() {
		return "BMW Model1";
	}

	@Override
	public int getPrice() {
		return 100000;
	}

	@Override
	public int door() {
		return 2;
	}

}

class Mercedes extends Car {

	@Override
	public String getBrand() {
		return "MERCEDES 5S";
	}

	@Override
	public int getPrice() {
		return 2323232;
	}

	@Override
	public int door() {
		return 6;
	}
}

class Toyota extends Car {

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Auris";
	}

	@Override
	public int getPrice() {
		return 2342343;
	}

}

class Ford extends Car {

	@Override
	public String getBrand() {
		return "Focus";
	}

	@Override
	public int getPrice() {
		return 34353;
	}

}

// n tane subclass olabilir.
