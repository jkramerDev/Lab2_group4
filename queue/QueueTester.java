package queue;

public class QueueTester {
	QueueImpl queue = new QueueImpl();
		//enqueue 6 riders
		queue.enQueue("Bobby");
		queue.enQueue("Scarlett");
		queue.enQueue("Grace");
		queue.enQueue("Tommy");
		queue.enQueue("Joe");
		queue.enQueue("Emily");
		
		//test display
		System.out.println("People in the queue: ");
		queue.display();	
		
		//add two more riders to the queue
		queue.enQueue("Drake");
		queue.enQueue("Vanessa");
		
		//test peek
		String frontOfQueue = queue.peek();
		System.out.println("First person in queue: " + frontOfQueue);
		
		//test dequeue
		String removedPerson = queue.deQueue();
		System.out.println("Removed person: " + removedPerson);
		
		//display after dequeue
		System.out.println("Queue after deQueue: ");
			queue.display();
		}
}
}

}
