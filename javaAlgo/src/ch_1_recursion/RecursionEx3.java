package ch_1_recursion;

public class RecursionEx3 {
    public static void main(String[] args) {

        int result = length("hello");
        System.out.println(result);
        print("algo");
        printReverse("ogla");
        printBinary(100);

        System.out.println();
        int[] arr = new int[10];
        for(int i=0 ; i<10; i++) {
            arr[i] = i + 1;
        }
        int sum = sum(10, arr);
        System.out.println(sum);
    }

    // 문자열의 길이
    public static int length(String str) {
        if(str.equals("")) { // base case
            return 0;
        }else {
            return 1 + length(str.substring(1)); // recursive case
        }
    }

    // 문자출력
    public static void print(String str) {
        if(str.length() == 0) {
            return;
        }else {
            System.out.print(str.charAt(0));
            print(str.substring(1));
        }
    }

    // 문자 거꾸로 출력
    public static void printReverse(String str) {
        if(str.length() == 0) {
            return;
        }else {
            printReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    // 2진수로 변환하여 출력
    public static void printBinary(int n) {
        if(n < 2) {
            System.out.print(n);
        }else {
            printBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    // 배열의 합 구하기 (data[0] ~ data[n - 1]) / n = 데이터의 수
    public static int sum(int n, int[] data) {
        if(n <= 0) {
            return 0;
        }else {
            System.out.println(data[n - 1]);
            return sum(n - 1, data) + data[n - 1];
        }
    }
}

// 모든 순환함수는 반복문으로 변경 가능 (그 역도 성립)
// 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현가능
// 함수 호출에 따른 오버해드가 있다.(매개변수 전달 등)