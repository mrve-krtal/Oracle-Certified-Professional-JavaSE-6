package _02.overrideVSoverloaded;

public class Notes {

}

//overloaded metotlar icin parametreleri degismelidir.
//sayi , tip olabilir
//override metotlar icin ise parametre ayni olmalidir.


//overloaded metotlar icin donus tipi degisebilir!
//override metotlarda ise donus tipi degismez.


//overloaded metotlar icin access level degisebilir fark etmez.
//override metotlar icin accel level artabilir azalamaz!

//public > protected > default level


//overloaded metotlar icin degiskenin tipi onemlidir. (compile time da belli olur)
//override metotlar icin ise objenin tipi onemlidir. calisma zamaninda /runtime da objenin tipine gore karar verilir.

class SuperClass {
	
	public void override(String param1 , int param2) {
		
	}
	
	void override2(String param1 , int param2) {
		
	}
	
	public static void staticMethodCantBeOverridden(String param1 , int param2) {
		
	}
}

class SubClass extends SuperClass {
	
	
	// bu metot override olmaz!
	// override metotlarda donus tipi degismez.
//	public int override(String param1 , int param2) {
//		return 0;
//	}
	
	
	// access level azalamaz!!!
//	void override(String param1 , int param2) {
//		
//	}
	
	// access level artabilir!!!
	protected void override2(String param1 , int param2) {
		
	}
	
	//override degil
	// bahsedilen override metot kurallari bu durum icin de gecerlidir!!!
	// yani public oldugu icin access level azalamaz!!!
//	static void staticMethodCantBeOverridden(String param1 , int param2) {
//		
//	}
}