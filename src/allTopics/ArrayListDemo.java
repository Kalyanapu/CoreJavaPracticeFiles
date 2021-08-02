package allTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> players = new ArrayList<String>();
		players.add("Naveen");
		players.add("Kalyanapu");
		players.add("kumar");
		players.add("Kohli");
		players.add(null);
		System.out.println(players);
		System.out.println(players.size());
		List<String> extra = Arrays.asList("Dhoni", "yuvraj", "Dravid");
		players.addAll(extra);
		System.out.println(players);
		System.out.println("----------------------");

		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		}
		System.out.println("----------------------");
		for (var i : players) {
			System.out.println(i);
		}
		System.out.println("-----------------");

		Iterator iterator = players.iterator();
		while(iterator.hasNext()) {
			String names=iterator.next();
			System.out.println(names);
		}

	}

}
