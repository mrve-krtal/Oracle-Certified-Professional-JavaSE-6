package _01.exception.handling;

public class Example03 {

	public static void main(String[] args) {

//		try {
//			// riskli kod
//			//Connection actik bu islemde exception firlatilabilir
//			Connection con = new Connection();
//			con.close(); // hata olmadigi durumda try blogu devam eder connection kapatilir.
//		} catch (Exception e) {
//			//catch blogu
//			con.close();
		
		// hem hata durumu hem de calisan durumu goz onune aldigimizda hem try hem catch blogunda connectioni kapattik.
		// fakat bu durumda duplication yapmis olduk!
//		} 
		
//		try {	
//			Connection con = new Connection();
//			
//		}catch(Exception e) {
//			
//		}finally {
//			con.close();
//			// hata olsa da olmasa da finally blogu calisacaktir.
//			// catch blogu calissa da calismasada finally blogu calisacaktir.
//		}


	}
}
