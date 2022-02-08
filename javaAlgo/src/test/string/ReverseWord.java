package test.string;

import java.util.Scanner;

public class ReverseWord {
    public static void solution(String[] words) {

        for(String word : words) {
            // 두 포인터로 반복해서 직접 위치를 바꿔서 풀어도 됨 (start < end 동안)
            // int start = 0, end = word.length() - 1;
            System.out.println(new StringBuilder(word).reverse().toString());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] words = new String[n];

        for(int i=0; i<n; i++) {
            words[i] = scanner.next();
        }
        solution(words);
    }
}
