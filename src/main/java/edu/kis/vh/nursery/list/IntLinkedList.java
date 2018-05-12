package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;

    public void push(int value) {
        if (last == null) {
            last = new Node(value);
        } else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int lastValue = last.getValue();
        last = last.prev;
        return lastValue;
    }

}
