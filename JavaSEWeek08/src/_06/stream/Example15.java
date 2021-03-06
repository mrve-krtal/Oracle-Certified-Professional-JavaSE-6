package _06.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example15 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("bufferedOutput.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		bos.write("conver byte array".getBytes());
		bos.close();

		FileInputStream fis = new FileInputStream("bufferedOutput.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		while (bis.available() > 0) {
			char c = (char) bis.read();
			System.out.print(c);
		}
	}
}
