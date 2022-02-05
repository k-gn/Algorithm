package queue;


public class QueueEx1 {
    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}

class Queue<T> {

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> first;
    public Node<T> last;

    public void add(T item) {
        Node<T> t = new Node<>(item);

        if(last != null) {
            last.next = t;
        }

        last = t;

        if(first == null) {
            first = last;
        }
    }

    public T remove() {
        if(first == null) {
            throw new RuntimeException();
        }

        T data = first.data;
        first = first.next;

        if(first == null) {
            last = null;
        }

        return data;
    }

    public T peek() {
        if(first == null) {
            throw new RuntimeException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
