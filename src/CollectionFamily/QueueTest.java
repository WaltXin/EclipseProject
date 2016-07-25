package CollectionFamily;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue FIFO
 * offer(E o)  add(E o)    when reach the limit size of queue, add() will throw an IlleagalStateException, offer() will return false
 * peek()      element()   Will return the head element but no delete the head element, when queue is empty, element() throw NoSuchElementException, peek() return null
 * poll()      remove()    Will return and delete the head element, when queue is empty remove() throw NoSuchElementException, poll() return null 
 * */
public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> pQueue = new PriorityQueue<Integer>();
		int time = 10;
		for (int i = time; i >= 0; i--)
		{
			queue.offer(i);
		}
		while (!queue.isEmpty())
		{
			pQueue.add(queue.poll());
		}
		while(!pQueue.isEmpty())
		{
			System.out.println(pQueue.remove());
		}
	}

}
