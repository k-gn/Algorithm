package ch_1_recursion;

public class RecursionEx1 {
    public static void main(String[] args) {

        int n = 4;

        int result = func(n);
        System.out.println(result);
    }

    // 0에서 n까지의 모든 자연수의 합
    public static int func(int n) {
        if(n <= 0) { // base case
            return 0;
        }else {
            return n + func(n - 1); // recursive case
        }
    }

    // 최대 공약수 1
    public static double gcd(int m, int n) {
        if(m < n) { // m >= n 기준을 설립
            int tmp = m;
            m = n;
            n = tmp;
        }

        if(m % n == 0) { // m 이 n의 배수라면 n 이 최대 공약수
            return n;
        }else { // 그렇지 않을 경우
            return gcd(n, m % n);
        }
    }

    // 최대 공약수 2
    public static double gcd2(int m, int n) {

        if(n == 0) { // m 이 n의 배수라면 n 이 최대 공약수
            return m;
        }else { // 그렇지 않을 경우
            return gcd2(n, m % n);
        }
    }
}
