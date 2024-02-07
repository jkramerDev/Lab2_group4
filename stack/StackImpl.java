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
		if (isFull()) {
			System.out.println("cannot push any more cuz stack is full");
			return;
		}
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
		if (isEmpty()) {
            return null; 
        }
        return stacks[top];
	}

	@Override 
	public void setCapacity(int size) {
		
	}

	@Override
	public void display() {
		System.out.print("[ ");
		for(int i = 0; i <= top; i++) {
			System.out.print(stacks[i] + " ");
		}
		System.out.println("]");
	}
}
