package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stack = new StackImpl();
		
		//create (push) 6 riders by name 
		stack.push("Jeff");
		stack.push("Chris");
		stack.push("Bob");
		stack.push("Alina");
		stack.push("Caro");
		stack.push("Avery");
		
		//iterate over the stack, print all riders 
		stack.display();
		
		//get size of stack
		System.out.println(stack.size());
			
		//peek at the stack, print results
		System.out.println("peeking at stack: " + stack.peek());
		
		//remove (pop) the top of the stack, iterate over the stack, print all riders
		System.out.println("removing top of stack...");
		stack.pop();
		
		//peek at the stack, print the results
		System.out.println("peeking at stack: " + stack.peek());
		
		//add two more riders to the stack
		stack.push("Joe");
		stack.push("Kate");
		
		//Peek at the stack & print the result
		System.out.println(stack.peek());
		
		//Remove all riders from the stack, pop off all elements w a loop
		System.out.println("removing all elements...");
		while(!stack.isEmpty()){
			stack.pop();
		}
		
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
