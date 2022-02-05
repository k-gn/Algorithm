package stack.ex2;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

class SetOfStacks {
    int capacity;

    ArrayList<Stack<Integer>> stacks = new ArrayList<>();

    SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public Stack<Integer> getLastStack() {
        if(stacks.size() == 0) return null;
        return stacks.get(stacks.size() - 1);
    }

    public void addStack() {
        stacks.add(new Stack<>());
    }

    public void removeLastStack() {
        stacks.remove(stacks.size() - 1);
    }

    public void push(int data) {
        Stack<Integer> last = getLastStack();
        if(last == null || last.size() == capacity) {
            addStack();
            last = getLastStack();
        }

        last.push(data);
    }

    public int pop() {
        Stack<Integer> last = getLastStack();

        if(last == null || last.isEmpty()) {
            throw new EmptyStackException();
        }

        int data = last.pop();
        if(last.isEmpty()) {
            removeLastStack();
        }
        return data;
    }
}

public class SetOfStack {
}
