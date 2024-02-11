package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue <String> queue = new LinkedQueue<>();
		//enqueue 6 riders
		queue.enQueue("Bobby");
		queue.enQueue("Scarlett");
		queue.enQueue("Grace");
		queue.enQueue("Tommy");
		queue.enQueue("Joe");
		queue.enQueue("Emily");
		
		// iterate over the queue and print all riders
		System.out.println("All riders in the queue:");
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		//add two more riders to the queue
		queue.enQueue("Drake");
		queue.enQueue("Vanessa");
		
		//peek at the queue
		System.out.println("Peek at the queue: " + queue.peek());
		
		//remove the head and reprint
		System.out.println("dequeue: " + queue.dequeue());
		
		//iterate over the queue and print all riders
		System.out.println("All riders in the queue after dequeue: ");
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}

}
