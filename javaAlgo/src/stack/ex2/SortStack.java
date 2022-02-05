package stack.ex2;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

    }

    private static void sort(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<>();
        while(!s1.isEmpty()) {
            int tmp = s1.pop();

            while(!s2.isEmpty() && s2.peek() > tmp) {
                s1.push(s2.pop());
            }
            s2.push(tmp);
        }

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
}
