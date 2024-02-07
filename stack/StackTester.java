package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl();
		stackTester.push("thing in stack");

		Stack stack = new StackImpl(6);
		
		//create (push) 6 riders by name 
		stack.push("Jeff");
		stack.push("Chris");
		stack.push("Bob");
		stack.push("Alina");
		stack.push("Caro");
		stack.push("Avery");
		
		//iterate over the stack
		
		
		//print all riders 
		stack.display();	
		
		//peek at the stack, print results
		stack.peek();
		
		//remove (pop) the top of the stack, iterate over the stack, print all riders
		stack.isFull();
		
		//peek at the stack, print the results
		
		//add two more riders to the stack
		
		//Peek at the stack & print the result
		
		
		//Remove all riders from the stack
			//pop off all elements w a loop
		
		
		//Verify the stack is now empty (print that result)
		if (stack.isEmpty() == true) {
			System.out.println("The stack is empty.");
		}else {
			System.out.println("The stack is not empty.");
		}

	}
	
	public static void runTests(Stack stack) {
	 	
	}

}
