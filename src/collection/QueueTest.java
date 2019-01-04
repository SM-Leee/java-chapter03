package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("또치");
		
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		while(queue.isEmpty()==false) {
			String s = queue.poll();
			System.out.println(s);
		}
		
		//비여있는 경우 null값을 리턴한다.
		System.out.println(queue.poll());
		
		
	}

}
