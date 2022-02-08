package test.array;

import java.util.Scanner;

public class Student {

    public static void solution(int[] arr, int n) {

        int result = 1;
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result++;
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        solution(arr, n);
    }
}
