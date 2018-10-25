package per.ds.stack;

public class BasicStack<X> {

	private X[] data;
	private int stackPointer;

	@SuppressWarnings("unchecked")
	public BasicStack() {
		data = (X[]) new Object[1000];
		stackPointer = 0;
	}

	public void push(X e) {
		data[stackPointer++] = e;
	}

	public X pop() {
		if (0 == stackPointer)
			throw new IllegalArgumentException("There are no elements in stack");
		return data[--stackPointer];

	}

	public boolean contains(X item) {
		boolean found = false;
		for (int i = 0; i < stackPointer; i++) {
			if (item.equals(data[i])) {
				found = true;
				break;
			}
		}
		return found;
	}

	public X access(X item) {
		while (stackPointer > 0) {
			X tempItem = pop();
			if (item.equals(tempItem)) {
				return tempItem;
			}
		}
		throw new IllegalArgumentException("Could Not find " + item + " on the Stack");

	}

	public int size() {
		return stackPointer;
	}
}
