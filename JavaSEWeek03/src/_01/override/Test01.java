package _01.override;


class Computer {

	int processor = 2;
	static int ram = 4;

	public void boot() {
		System.out.println("Computer Booting...");
	}
	
	public static void shutdown() {
		System.out.println("Computer Shutdown....");
	}
	
	private void reset() {
		System.out.println("Computer reset...");
	}
	
	public final void install () {
		System.out.println("Computer Install..");
	}
}

class Laptop extends Computer {

	//JAVADA sadece instance methodlar override edilir.
	// bu islem override degildir.
	// yani burada onemli  nokta degiskenin tipidir!
	int processor = 8;  //instance degisken
	static int ram = 16; // static degisken

	@Override
	public void boot() {
		System.out.println("Laptop Booting...");
	}
	
	// @Override
	// @Override annotationi sadece override edilen metotlar icin kullanilabilir!
	// Javada static methodlar override EDILEMEZLER!!!
	public static void shutdown() {
		System.out.println("Laptop Shutdown....");
	}
	
	public void retina() {
		System.out.println("Cool retina...");
	}
	
	// @Override
	// private metotlar override edilemezler!
	// cunku visible/gorunur degildir.
	// 
	private void reset() {
		System.out.println("Computer reset...");
	}
	
	// @Override
	// final methodlar override edilemezler!
//	public final void install () {
//		System.out.println("Computer Install..");
//	}
}

public class Test01 {

	public static void main(String[] args) {

		Computer computer = new Computer ();
		
		//Computer compute -> Computer tipinde bir degisken tanimliyoruz.
		// javada 8 tane primitive tip degisken vardir.
		// byte short int long float double char boolean
		// bunun disindaki butun degiskenler reference type variable dir.
		//
		// String ? -> reference type
		// Integer -> reference type
		// int [] -> reference type
		
		// bir baska acidan degiskenleri ;
		// - local degisken  
		// - instance degisken
		// - static degisken
		// bu degisken LOCAL degiskendir!
		
		// degiskenimiz local ve reference type 
		
		// Computer (); -> constructori cagirmaktayiz.
		
		// = operatoru assignment operatoru. atama operatoru
		
		// javada objeler Heap Memory de yasarlar.
		
		// local degiskenler stack'te yasarlar!
		// instance degiskenler ise heap te yasarlar.
		
		computer.boot();
		
		Laptop laptop = new Laptop();
		laptop.boot();
		
		Computer laptopComputer = new Laptop();
		
		// 1 - degiskenin tipi Computer tipinde!
		// 2 - objenin tipi ise Laptop dir!
		
		// Laptop computerLaptop = new Computer();
		// Laptop IS-A Computer onermesi DOGRUDUR
		// Computer IS-A Laptop onermesi YANLISTIR
		
		// javada bir reference type degisken kendi tipinde ya da subclass/alt sinifi tipinde bir objeyi gosterebilir.
		// (refer)
		
		laptopComputer.boot();
		laptopComputer.shutdown();
		// static metotlara reference type degisken uzerinden erisim sagladigimizda eclipse warning verir.
		Computer.shutdown(); // DOGRU YAKLASIM!
		// laptopComputer.retina(); // legal degildir!
		
		// override metotlar icin dynamic dispatch denilen mekanizma isler!
		// dynamic method dispatch
		// hangi override metodun calisacagina java run time da karar verir!
		// objenin tipine gore ilgili metot calisir.
				
		//
		System.out.println(laptopComputer.processor);
		System.out.println(laptopComputer.ram);
		//DEGISKENIN TIPI ONEMLIDIR
		//laptopComputer reference type degiskenin tipi Computer oldugu icin burada Computer sinifinda yer alan degerler yazilir.
		// degiskenler icin OVERRIDE diye bir kavram soz konusu degildir!
	}
	
	
}
