package _03.referenceCasting;


class Animal {

	public void eat() {
		System.out.println("Animal eat...");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat...");
	}
	
	public void bark() {
		System.out.println("Dog bark...");
	}
}

class Kangal extends Dog {

}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat...");
	}
	
	public void meow() {
		System.out.println("Cat meow...");
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		Animal animalDog = new Dog();
		// degisken tipi Animal
		// objenin tipi Dog

		//DOWNCASTING islemi
		// super -> sub
		Dog dog = (Dog) animalDog; //yeni bir obje olusmaz!
		dog.bark();
		
		//Cat cat = (Cat) animalDog;
		
		// java.lang.ClassCastException verir
		// cat degiskeni Dog objesini gosteremez (refer) !!
		//cat.meow();
		
		
		Animal animal = new Animal();
		//obje Animal!
		
		// Animal tipindeki objeyi Dog tipindeki degisken gostersin (!)
		// KURAL : bir reference type degisken kendi tipinde  ya da subclassi tipinde bir objeyi gosterebilir!
		// super classi tipindeki bir objeyi GOSTEREMEZ!
		
		// Dog dog2 = (Dog) animal;
		
		//java.lang.ClassCastException aliriz!
		// Dog tipindeki degisken Animal tipindeki objeyi gosteremez. Animal super sinif!
		// Animal IS-A Dog olmali! (yanlis)
		// tam ters olarak Dog IS-A Animal
		
		// Object type IS-A variable type
		
		
		Animal animalKangal = new Kangal();
		
		// Kangal IS-A Animal
		
		Dog dogKangal = (Dog) animalKangal;
		// Obje tipi Kangal
		// Degisken tipi Dog

		// Kangal IS-A Dog ? DOGRUDUR
		
		Object objectAnimal = new Animal();
		// java.lang.Object sinifi sinif hiyarersisinde en tepede yer alir!
		
		// butun classlar icin IS-A Object onermesi DOGRUDUR!
		// Animal IS-A Object DOGRUDUR!
		
		// String compileError = (String) dogKangal; 
		// hic bir zaman boyle bir legal casting yapilamz!
		// String ile Animal. Dog arasinda bir hiyerarsik durum soz konusu degil!
		// compile error!
		
		
		Dog upcasting = new Dog();
		Animal animalUpcasting = upcasting; // UPCASTING
		// sub -> super
		// bu islem her zaman LEGADIR!
		//
		// downcasting soz konusu oldugunda (		Dog dogKangal = (Dog) animalKangal;)
		// acik skeilde/explicity olarak casting yapmamiz gereklidir!
		
		// upcasting isleminde risk yoktur. acik sekilde/explicity olarak casting yapmaya gerek yoktur.
		// kapali/implicit sekilde yapilir.
		
		Animal animalUpcastingExplicity = (Animal)upcasting; 
		
	}
}

// upcasting 
// downcasting