package allTopics;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterP {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Files\\Naveen\\File.txt");
		fw.write(100);
		fw.write('a');
		fw.write("Naveen");
		char ch[] = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.flush();
		fw.close();

	}

}
