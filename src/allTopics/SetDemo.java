package allTopics;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String>team=new HashSet<>();
		team.add("Hockey");
		team.add(null);
		team.add("javalien");
		team.add("Hockey");
		team.add("Badminton");
		System.out.println(team);
		
		

	}

}
