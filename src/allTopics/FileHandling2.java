package allTopics;

import java.io.File;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Files\\Demo.txt");
		f.createNewFile();
		System.out.println("Created");

		File f1 = new File("D:\\Files\\kumar");
		f1.mkdirs();
		System.out.println("Directory created");
		File f6 = new File("D:\\Files\\Naveen", "kalyanapu");
		f6.mkdirs();
		f.exists();
		System.out.println();
		System.out.println("f3 Directory created");

		File f2 = new File("D:\\Files\\Naveen", "Hello.txt");
		f2.createNewFile();
		System.out.println("The new file created in Naveen Dir");
		System.out.println(f2.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f2.list());
		System.out.println(f2.length());
		System.out.println(f.delete());

		// To get all file names
		int count = 0;
		File f3 = new File("C:\\Program Files");

		String[] s = f3.list();

		for (String s1 : s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The count of files:" + count);

		// To get all files list
		System.out.println("-----------");
		int count1 = 0;
		File f4 = new File("C:\\Program Files");

		String[] s2 = f4.list();
		for (String s1 : s2) {
			File f5 = new File(f4, s1);

			if (f5.isFile()) {
				System.out.println(s1);
			}

		}
		System.out.println(count1);
	}
}
