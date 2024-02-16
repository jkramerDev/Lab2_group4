package queue;
import java.util.Queue;

public class QueueImpl implements Queue {
	int LENGTH = 5;
	String[] arr = new String[LENGTH];
	int size = 0;

	ppublic boolean isFull() {
		return (size == arr.length);
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	public void enQueue(String element) {

		if (isFull()) {
			System.err.println("sorry, full queue");
		} else if (isEmpty()) {
			arr[0] = element;
			size++;
		} else {
			
			//everybody shift one to the 'right'
			for (int i = size; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			
			//last one on 
			arr[0] = element;
			size++;
		}

	}

	public String deQueue() {
		String removedPerson = null;
		if(isEmpty()) {
			System.out.println("Sorry, empty queue");
		}else {
			removedPerson = arr[size -1];
			for(int i = size -1; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			size--;
		}
		return removedPerson;
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Sorry the queue is empty");
		}else {
			System.out.println("People in the queue: ");
			for(int i = 0; i <size; i++) {
				System.out.println(arr[i]);
			}
		}

	}

	@Override
	public String peek() {
		if(isEmpty()) {
			System.out.println("Sorry the queue is empty");
			return null;
		}else {
			return arr[size -1];
		}
	
	}

}
