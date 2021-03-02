package _01.exception.handling;

public class Example02 {

	public static void main(String[] args) {

		// finally blogu ->  kodumuzda exception olsun ya da olmasin calismasini
		// istedigimiz bir kod blogunu finally blogu icerisine aliriz.
		
		// close resource , clean up 
		// database connection , network islemleri , dosya okuma/yazma vs vs bu gibi islemlerde kaynaklarin temizlenmesi/kapatilmasi
		// gereklidir.
		// aksi durumda memory leak'ler , memory sismeleri ortaya cikabilir (OutOfMemoryError)
		// ya da veritabani ,siser , isteklere cevap veremez.
		
		
		try {
			System.out.println(100/0);
			System.out.println("not work!");
			
			// kod/proje crash olur.
			// catch blogu yok
			// finally blogu yine de calisir!
		}finally {
			System.out.println("finally works!\n");
		}
		
		System.out.println("not work");

	}
}

// Olabilecek format
// try-catchXN-finally  N -> 0 , 1 , 2...

// TEK BASINA finally olamaz
// catch-finally seklinde de olamaz.
