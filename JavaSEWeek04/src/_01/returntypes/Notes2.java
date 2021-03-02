package _01.returntypes;

import java.util.ArrayList;
import java.util.List;

public class Notes2 {

	// rule - 1
	public String getKey() {
		return null;
	}

	// rule - 1
	public Integer getValue() {
		return null;
	}

	// arrayler reference type
	// rule1 rule2
	public int[] getValues() {
		return null;
	}

	public static void main(String[] args) {

		char c = 'c';
		System.out.println(c);
		System.out.println((int) c);
		System.out.println((int) Character.MAX_VALUE);
	}

	// In a method with a primitive return type, you can return any value or
	// variable that can be implicitly converted to the declared return type.

	public int foo() {
		char c = 'c';
		return c; // char is compatible with int
	}

	// In a method with a primitive return type, you can return any value or
	// variable that can be explicitly cast to the declared return type.
	public int foo2() {
		float f = 32.5f;
//		long lo = 10;
//		return (int) lo;
		return (int) f;
	}

	// void metot icin geriye bir sey donduremeyiz ! legal degildir
	public void bar() {
		// return "this is it"; // Not legal!!
	}

	
	public void invoke() {
		method(-10);
	}
	
	public void method(int number) {
		
		
		if(number < 0)
			return;
		//
		//
		//
		//
		//
		//
	}
	
	public List<String> getList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		return arrayList;
	}

}

// 1 - metot donus tipi referecen type ise null donebilir. (null donmek genelde iyi bir kod pratigi degildir.)

// 2 - donus tipi array olabilir. An array is a perfectly legal return type.

// 3 - 
// char 16bit / 2byte unsigned bir veri tipi.
// unsigned -> isaretsiz -> negatif degil.

// 2ˆ16-1
// 0 - 65535

// 4 - ornek olarak metot donus tipi int ise , geriye float , double , long donmek istersek bu durumda casting yapmak gereklidir.

// 5 - void metotlar geriye bir sey donmez.

// 6 - metot donus tipi super class / interface ise
// dondugumuze deger/reference subclass olabilir.