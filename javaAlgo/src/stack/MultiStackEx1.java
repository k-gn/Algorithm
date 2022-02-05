package stack;

class FixedMultiStack {

    private int numOfStacks = 3;
    private int stackSize;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize) {
        this.stackSize = stackSize;
        this.sizes = new int[stackSize];
        this.values = new int[numOfStacks * stackSize];
    }

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackSize;
    }

    public int getTopIndex(int stackNum) {
        int offset = stackSize * stackNum;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    public void push(int stackNum, int data) {
        if(isFull(stackNum)) {
            throw new RuntimeException();
        }

        values[getTopIndex(stackNum) + 1] = data;
        sizes[stackNum]++;
    }

    public int pop(int stackNum) {
        if(isEmpty(stackNum)) {
            throw new RuntimeException();
        }
        int top = getTopIndex(stackNum);
        int data = values[top];
        values[top] = 0;
        sizes[stackNum]--;

        return data;
    }
}

public class MultiStackEx1 {
    public static void main(String[] args) {

        FixedMultiStack ms = new FixedMultiStack(5);

    }
}
