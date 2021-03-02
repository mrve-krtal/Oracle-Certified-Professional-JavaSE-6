package _07.overloaded;

class Overloaded1{
	
	void method(int number) {
		System.out.println("int");
	}
	
	//metot ismi ayni ise , parametre listesi farkli olmalidir! 
	// derleme hatasi verir!
	// donus tipi farkli olsa da fark etmez!
	
	/*
	int method(int number) {
		System.out.println("long");
	}
	*/
	
	protected void method(long number) {
		System.out.println("long");
	}
	
	// donus tipi degisebilir!
	// access level degisebilir!
	public byte method (byte b) {
		return 10;
	}
}
public class OverloadedTest01 {

	public static void main(String[] args) {

		Overloaded1 over = new Overloaded1();
		
		over.method(100);
		over.method(100L);
		
	}

}
