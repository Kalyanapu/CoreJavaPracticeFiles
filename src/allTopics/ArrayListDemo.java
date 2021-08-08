package allTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> players = new ArrayList<>();
		players.add("Naveen");
		players.add("kumar");
		players.add("kalyanapu");
		System.out.println(players);
		System.out.println(players.getClass().getSimpleName());
		List<String> course = Arrays.asList("java", "front-end", "full stack");
		players.addAll(course);
		System.out.println(players);
		System.out.println(course.getClass().getSimpleName());
		System.out.println(players.getClass().getSimpleName());
		System.out.println(players.size());
		System.out.println(players.get(3));
		players.set(2, "Back-end expert");
		players.remove(4);
		System.out.println(players);
		Collections.sort(players);
		System.out.println(players);
		Collections.reverse(players);
		System.out.println(players);
		Collections.synchronizedCollection(players);
		System.out.println(players);

		System.out.println("-----------------------------------");

		// iterating over ArrayList -- for loop
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		}
		System.out.println("-------------------------------------");
		for (String s : players) {
			System.out.println(s);
		}
		System.out.println("---------------------------------------");
		Iterator<String> player = players.iterator();
		while (player.hasNext()) {
			String p = player.next();
			System.out.println(p);
		}
		System.out.println("----------------------------------");
		ListIterator<String> play = players.listIterator();
		while (play.hasNext()) {
			String s = play.next();
			System.out.println(s);

		}
		System.out.println("--------------------------------");
		ListIterator<String> pla = players.listIterator(5);
		while(pla.hasPrevious()) {
			String t=pla.previous();
			System.out.println(t);
		}
	}

}
