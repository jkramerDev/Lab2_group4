package stack; 

public class StackImpl implements Stack {
	protected String[] stacks;
	protected int top;
	protected int size;
	
	public StackImpl(int size) {
		stacks = new String[size];
		top = -1;
		this.size = size;
	} 

	@Override
	public void push(String s) {
		System.out.println("thing i added to stack: " + s);
		top++;
		stacks[top] = s;
	}

	@Override
	public String pop() {
		String person = stacks[top];
		top--;
		return person;
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
		return size;
	}

	@Override
	public String peek() {
		
		return null;
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println();
		for(int i = 0; i < stacks.length; i++) {
			System.out.print(stacks[i] + " ");
		}
	}
}
