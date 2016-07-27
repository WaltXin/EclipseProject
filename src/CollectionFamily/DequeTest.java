package CollectionFamily;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTest {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		Deque<String> deque1 = new LinkedList<String>();
		deque1.add("string into deque1");
		deque.add("a");
		deque.addFirst("b");
		deque.addLast("c");
		Iterator<String> it = deque.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(deque.element());		
		System.out.println(deque.getFirst());
		System.out.println(deque.removeFirst());
		System.out.println(deque.getFirst());
	}

}
