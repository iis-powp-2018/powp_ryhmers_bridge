package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntStack {
	private static final int INITIALTOTAL = -1;

	private static final int ARRAYSIZE = 12;

	private int[] numbers = new int[ARRAYSIZE];

	public int total = INITIALTOTAL;

	@Override
	public void push(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean isEmpty() {
		return total == INITIALTOTAL;
	}

	public boolean isFull() {
		return total == 11;
	}

	@Override
	public int top() {
		if (isEmpty())
			return INITIALTOTAL;
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return INITIALTOTAL;
		return numbers[total--];
	}
}
