package _02.vararg;

public class VarArgTest01 {

		public static void main(String[] args) {
	
			method();
			method(1);
			method(2,4);
			method(2,6,7);
		
			method2();
			method2("param1");
			method2("param1", "param2");
		}
		
		// 1 metot icerisinde varag en sonda olmalidir.
		// 1 metot icerisinde bir tane olmali.
		// ... degisken isminden once olmalidir.
		
		public static void method(int ... numbers) {
			System.out.println(numbers.length);
			
		}
	
		
		public static void method2(String ... numbers) {
			System.out.println(numbers.length);
		}
}
