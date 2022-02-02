package ch_1_recursion;

public class RecursionEx2 {
    public static void main(String[] args) {

        int n = 4;

        int result = factorial(n);
        System.out.println(result);

        int fibo = fibonacci(10);
        System.out.println(fibo);
    }

    // 1에서 n까지의 모든 자연수의 곱
    public static int factorial(int n) {
        if(n == 0) { // base case
            return 1;
        }else {
            return n * factorial(n - 1); // recursive case
        }
    }

    // x 의 n 승
    public static double power(double x, int n) {
        if(n == 0) {
            return 1;
        }else {
            return x * power(x, n - 1);
        }
    }

    // fibonacci
    public static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
