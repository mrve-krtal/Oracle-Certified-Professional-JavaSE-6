package _05.buffered;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example12 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("printWriter.txt");
		pw.println("line1");
		pw.println("line2");
		pw.println("line3");
		
		pw.close();
		
		// PrintWriter sinifi var!
		// PrintReader diye bir sinif yoktur.
	}
}
