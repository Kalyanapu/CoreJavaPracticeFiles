package allTopics;

import java.io.File;
import java.io.IOException;

public class DemoFiles {

	public static void main(String[] args) throws IOException {
		int count = 0;
		File f = new File("C:\\Program Files");

		String[] s = f.list();

		for (String s1 : s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The total count of files & dir:" + count);
		System.out.println("---------------");
        int c=0;
		File f1 = new File("C:\\Windows");
		String[] s1 = f1.list();
		
		for(String t:s1) {
		File f2=new File(f1,t);
		if(f2.isFile()) {
			c++;
			System.out.println(t);
		}
		System.out.println("the count:"+c);
		}

	}

}
