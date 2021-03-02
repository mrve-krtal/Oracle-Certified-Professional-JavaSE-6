package _06.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example14 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("fos.txt");

		String content = "content line1";
		fos.write(content.getBytes());
		fos.close();
		
		

	}
}

// Writer/Reader -> Character Oriented
// InputStrean/OutputStream -> Byte Oriented