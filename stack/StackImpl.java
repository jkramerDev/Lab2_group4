package stack; 

public class StackImpl implements Stack {
	private String [] elements = new String[10];
	private int top = -1;
	private int size = 10;
	
	@Override
	public void push(String el) {
	
		if (isFull())
			System.err.println("full stack");
		else
		{
			top++;
			elements[top] = el;
	
		}
	}

	@Override
	public String pop() {
		String poppedElement = null;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			poppedElement = elements[top];
			top--;
		}
		return poppedElement;
	}

	@Override
	public Boolean isEmpty() {
		return top == -1;
	}

	@Override
	public Boolean isFull() {

		return top == size - 1;
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public String peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}else {
			return elements[top];
		}
	}

	@Override
	public void setCapacity(int size) {
		if(size < top + 1) {
			System.out.println("Size is less than the current number in the stack.");
		}
		String [] newSize = new String [size];
		for(int i = 0; i <= top; i ++) {
			newSize[i] = elements[i];
		}
		elements = newSize;
		
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Elements in stack: ");
			for(int i = top; i >= 0; i--) {
				System.out.println(elements[i]);
			}
		}
		
	}
 



		
		
	}
