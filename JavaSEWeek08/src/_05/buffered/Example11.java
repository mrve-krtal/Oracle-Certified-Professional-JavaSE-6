package _05.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example11 {

	public static void main(String[] args) throws IOException {

		File file = new File("buffered.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("line1");
		bw.write("\n");
		bw.write("line2");

		bw.close();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// readLine metodu saglar.

		String lineContent = null;

		int line = 1;
		while ((lineContent = br.readLine()) != null) {
			System.out.println(line + "  , " + lineContent);
			line++;
		}

	}
}
