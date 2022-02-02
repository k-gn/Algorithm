package ch_1_recursion;

public class RecursionEx1 {
    public static void main(String[] args) {

        int n = 4;

        int result = func(n);
        System.out.println(result);
    }

    public static int func(int n) {
        if(n <= 0) { // base case
            return 0;
        }else {
            return n + func(n - 1); // recursive case
        }
    }
}
