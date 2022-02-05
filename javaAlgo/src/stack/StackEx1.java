package stack;

public class StackEx1 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

class Stack<T> {

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top; // 맨위값

    public T pop() {
        if(top == null) {
            throw new RuntimeException();
        }

        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        Node<T> t = new Node<>(item);

        t.next = top;
        top = t;
    }

    public T peek() {
        if(top == null) {
            throw new RuntimeException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

}