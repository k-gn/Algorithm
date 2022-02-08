package test.string;

import java.util.Scanner;

public class ShortDistance {
    public static void solution(String str, char c) {

        boolean flag = false;
        int count = str.length() + 1;
        str = str.toLowerCase();

        int[] answer = new int[str.length()];

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                count = 0;
                answer[i] = 0;
            }else {
                count++;
                answer[i] = count;
            }
        }


        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == c) {
                count = 0;
            }else {
                count++;
                answer[i] = Math.min(answer[i], count);
            }
        }

        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char c = scanner.next().charAt(0);

        solution(str, c);
    }
}
