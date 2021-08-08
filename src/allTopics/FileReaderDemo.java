package allTopics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\Files\\kumar\\fw.txt");
		int i = fr.read();
		while (i != -1) {

			System.out.println((char) i);
			i = fr.read();

		}
		System.out.println("------------");
	 File f=new File("D:\\Files\\kumar\\fw.txt");	
	  char []ch=new char[(int) f.length()];
	  FileReader fr1=new FileReader(f);
	  fr1.read(ch);
	  for(char ch1:ch) {
		  System.out.println(ch1);
	  }

	}

}
