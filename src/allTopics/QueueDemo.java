package allTopics;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> num = new PriorityQueue<>();
		num.add(15);
		num.add(20);
		num.add(20);
		System.out.println(num);
		System.out.println(num.peek());
		System.out.println(num);
		System.out.println(num.poll());
		System.out.println(num);
		System.out.println(num.poll());
		System.out.println(num.poll());
		System.out.println(num);
		

	}

}
