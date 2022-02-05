package stack;

class StackWithMin2 extends Stack<Integer> {
    Stack<Integer> s2;

    public StackWithMin2() {
        s2 = new Stack<>();
    }

    public int min() {
        if(this.isEmpty()) {
            return Integer.MAX_VALUE;
        }else {
            return s2.peek();
        }
    }

    public void push(int value) {
        if(value < min()) {
            s2.push(value);
        }

        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();

        if(value == min()) {
            s2.pop();
        }

        return value;
    }

}

public class MinStackEx2 {
    public static void main(String[] args) {


    }
}
