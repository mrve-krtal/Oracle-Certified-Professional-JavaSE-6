package _03.file;

import java.io.File;
import java.io.IOException;

public class Example07 {

	public static void main(String[] args) throws IOException {

		File file = new File("test.txt");
		// File objesi olusr!
		// harddiskte yeni bir dosya olusmaz.
		
		file.createNewFile();
		

/*
		try {
			System.out.println(file.exists());
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
	}
}

// java.io.File
// File -> dosya
// File sinifi , bir dosyayi (file) ya da bir dizin/directory/folder'i gosterebilir.
// Bu sinif dosyadan veri okumak/yazmak icin KULLANILMAZ.
// File sinifini , yeni bir bos dosya olusturmak , klasor olusturmak , dosya silmek ,isim degistirmek gibi islemler icin kullanabiliriz.