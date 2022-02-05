package stack;

class NodeWithMin {
    int value;
    int min;

    NodeWithMin(int v, int min) {
        value = v;
        this.min = min;
    }

}

class StackWithMin extends Stack<NodeWithMin> {
    public int min() {
        if(this.isEmpty()) {
            return Integer.MAX_VALUE;
        }else {
            return peek().min;
        }
    }

    public void push(int value) {
        int newMin = Math.min(value, min());

        super.push(new NodeWithMin(value, newMin));
    }
}

public class MinStackEx1 {
    public static void main(String[] args) {


    }
}
