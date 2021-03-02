package _04.operators;

public class Example08 {

	public static void main(String[] args) {

		// boolean degiskenler icin == kullanmak hataya neden olabilir.

		boolean b = false;

		//riskli hatali yaklasim
		if (b = true) { // DIKKAT burada = operatoru kullandi == degil!
			// amac burada degiskenin degeri true mu ?
			// fakat == yerine = kullandigimizda assignemtn yapiyoruz!
			// dolayisiyla bu degisken her zaman true olacaktir.
			// her zaman bu if blogu calisacaktir.
			System.out.println("if works!");
			// boolean degiskenler icin == kontrolunu kullanma!
		} else {
			System.out.println("else works");
		}
		
		//
		
		//DOGRU YAKLASIM
		if(b) {
			
		}
		
		
		int x = 10;
		
		//burada == yerine = yaparsak derleme hatasi aliriz.
		// hatamizi goruruz burada hemen.
//		if( x = 20) {
//			
//		}
		
		
	}
}
