package queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl implements Queue {
	private Queue<String> queue;
	
	public QueueImpl() {
		queue = new LinkedList<>();
	}
	public void enQueue(String item) {
		queue.add(item);
	}
	public String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return queue.remove();
	}
	public String peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return queue.peek();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
