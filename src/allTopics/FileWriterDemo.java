package allTopics;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("D:\\Files\\kumar\\Fw.txt");
		f.write(100);
		f.write("Naveen a java developer");
		f.write("\n");
		char ch[]= {'a','b','c'};
		f.write(ch);
		f.flush();
		f.close();
	}

}
