package _03.garbagecollection;

public class Example05 {

	public static void main(String[] args) {

		Person person = new Person("user_name", "user_surname");
		//
		//
		//
		//
		//
		//
		//
		person = null;
		// person = null dedigimizde , person degiskeni ilgili objeyi gostermez.
		// bu objeyi gosteren baska bir reference degisken yok.
		// bu nokta itibariyle artik bu obje sahipsiz kaldi.
		// bu nedenle artik garbage collector tarafindan temizlenmeye uygun hale geldi.
		// hemen temizleneneceginin bir garantisi yoktur.
		//
		//
		//
		//
	}
}

class Person {
	String name;
	String surname;

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

}
