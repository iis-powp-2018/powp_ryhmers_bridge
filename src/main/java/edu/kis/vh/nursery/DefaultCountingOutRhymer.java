package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.*;

public class DefaultCountingOutRhymer {
	private IntStack IntList;

	public DefaultCountingOutRhymer() {
		super();
		IntList = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntStack intList) {
		super();
		IntList = intList;
	}

	public int prevValue() {
		return IntList.top();
	}

	public void countIn(int in) {
		IntList.push(in);
	}

	public boolean callCheck() {
		return IntList.isEmpty();
	}

	public boolean isFull() {
		return IntList.isFull();
	}

	public int countOut() {
		return IntList.pop();
	}

}
