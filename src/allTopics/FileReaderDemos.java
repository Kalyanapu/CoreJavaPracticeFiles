package allTopics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemos {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\Files\\Naveen\\File.txt");
		int a=fr.read();
		int b=fr.read();
		System.out.println(a);
		System.out.println(b);
		
		while(a!=-1) {
			System.out.println((char)a);
			a=fr.read();
		}
		File f=new File("D:\\Files\\Naveen\\File.txt");
		FileReader fr1=new FileReader(f);
		char ch[]=new char[(int) f.length()];
		fr1.read(ch);
		for(char ch1:ch) {
			System.out.println(ch1);
			
		}
		

	}

}
