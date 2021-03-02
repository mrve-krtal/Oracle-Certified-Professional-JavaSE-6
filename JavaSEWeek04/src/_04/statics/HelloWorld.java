package _04.statics;

public class HelloWorld {

	String name = "levent"; // bu instance degiskendir.
	// instance degisken objeye aittir.
	// ortada bir obje olacak ki bu objeye ait degisken (instance degisken) olsun.

	public static void main(String[] args) {
		
		
		// hangi objenin name alani ?
		// ortada bir obje yok!
		// static metottan direkt olarak instance metoda ya da instance degiskene erisim saglanamaz.
		// cunku ortada bir obje yok!
		//System.out.println(name);		
		//testMethod(); //legal degildir! compile error
		
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.name);
		hello.name="new name";
		System.out.println(hello.name);
		
		hello.testMethod();
		
		// this.name ="not legal"; 
		// stattic metotta this fiadesini bu sekilde kullanamaiyz.
	}
	
	
	// bu metoda erisim oldugu noktada ortada bir obje olacak.
	// dolayisila obje varsa instance degisken de vardir!
	// obje yoksa instance degiskenin varligindan soz edemeyiz.
	private void testMethod() {
		
		//this -> ifadesi kullanilabilir
		// this -> current object ifade eder.
		System.out.println(this.name);
		//legaldir.
	}
}
