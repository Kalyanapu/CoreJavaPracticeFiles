package allTopics;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Files\\Hello.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		File f1=new File("D:\\Files\\Naveen");
		System.out.println(f1.exists());
		f1.mkdirs();
		System.out.println(f1.exists());

	}

}
