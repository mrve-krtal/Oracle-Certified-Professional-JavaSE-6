package _02.constructor;

public class ConstructorNotes02_Chaining {

	public static void main(String[] args) {
		
		
		// Dog dog = new Dog();
		Kangal kangal = new Kangal();
	}
}

// constructor chaining/yapilandirici zinciri
// constructor , yapilandirici , kurucu gibi turkce karsiliklar gorulebilir.


// ilk olarak Dog sinifinda yer alan constructor calisir.
// super() ifadesi oldugu icin Animal sinfiindaki constructora gider
// sonrasinda java.lang.Object e gider
class Animal {

	Animal() {
		
		//System.out.println("compile error!"); // ILK IFADE super() olmalidir! bu sekilde derleme hatasi verir.
		super(); // super() ifadesi acik skeilde yazilirsa , ilk ifade olmalidir.
		System.out.println("Animal constructor...");
	}
}

class Dog extends Animal {

	Dog() {
		//constructorlarin basinda ilk calisan ifade super() ifadesidir.
		// bir ust sinifta yer alan parametre almayan constructor i cagir.
		
		super();
		System.out.println("Dog constructor....");
	}
}


class Kangal extends Dog {
	Kangal () {
		super();
		System.out.println("Kangal constructor..");
	}
}