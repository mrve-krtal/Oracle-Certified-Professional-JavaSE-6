package _03.file;

import java.io.File;
import java.io.IOException;

public class Example09 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("old_name.txt");
		file.createNewFile();
		
		
		File fileNewName = new File("new_name.txt");
		
		file.renameTo(fileNewName);
		
		
	}
}
