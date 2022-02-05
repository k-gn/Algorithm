package stack.ex2;

import java.util.Stack;

class MyQueues<T> {
    Stack<T> stackNewest, stackOldest;

    MyQueues() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    public int size() {
        return stackOldest.size() + stackNewest.size();
    }

    public void add(T value) {
        stackNewest.push(value);
    }

    public void shiftStacks() {
        if(stackOldest.isEmpty()) {
            while(!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public T remove() {
        shiftStacks();
        return stackOldest.pop();
    }

    public T peek() {
        shiftStacks();
        return stackOldest.peek();
    }
}


public class MyQueue {
    public static void main(String[] args) {

    }
}
