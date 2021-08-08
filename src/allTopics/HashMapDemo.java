package allTopics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		Student student1 = new Student(1, "Naveen");
		studentMap.put(1, student1);
		Student student2 = new Student(2, "kalyanapu");
		studentMap.put(2, student2);
		System.out.println(studentMap.get(1));
		Iterator<Map.Entry<Integer, Student>> entry = studentMap.entrySet().iterator();

		while (entry.hasNext()) {
			Map.Entry<Integer, Student> iterator = entry.next();
			System.out.println(iterator);
		}

	}

}
