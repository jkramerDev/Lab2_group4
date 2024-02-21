package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		System.out.println("-----L I S T  T E S T------");
		LinkedListTester.main(args);
		//listRunTestMethod...
 		
		System.out.println("-----S T A C K  T E S T------");
		StackTester.main(args);
		//QRunTestMethod...
	 
		System.out.println("----Q U E U E  T E S T-------");
		QueueTester.main(args);
		//StackRunTestMethod...

}
