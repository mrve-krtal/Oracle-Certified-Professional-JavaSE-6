package _05.flow.control;

public class NotesForSwitchCase {

	public static void main(String[] args) {

		int key = 5;
		switch (key) {
		case 0:
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("cift");
			break;

		default:
			System.out.println("tek");
			break;
		}
	}
}

// switch- case keyword

// eger cok fazla if-else-if-else seklinde bir yapi varsa bu durumda tercih edebiliriz.

//switch(expression)
//case contant1 : code block ;
//case contant2 : code block ;
//case contant3 : code block ;
//default : code block;

// char , short , byte , int ya da bunlarin wraperlari kullanilabilir
// Character Short Byte Integer

// double , float , long -> Double Float Long olmaz!!

// String Java 7 ile birlikte eklendi. 

// enumlarda kullanilir!

// switch-case yapisinda break anahtar kelimesi kullanilmaktadir.