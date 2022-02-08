package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void solution(int[] arr, int n) {

        int[] rank = new int[n];

        for(int i=0; i<rank.length; i++) {
            rank[i] = 1;
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    rank[i]++;
                }
            }
        }

        for(int i=0; i< rank.length; i++) {
            System.out.print(rank[i] + " ");
        }
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
