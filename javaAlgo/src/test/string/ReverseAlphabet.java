package test.string;

import java.util.Scanner;

public class ReverseAlphabet {
    public static String solution(String str) {

        int start = 0;
        int end = str.length() - 1;
        char[] c = str.toCharArray();

        while(start < end) {
            if(Character.isAlphabetic(c[start]) && Character.isAlphabetic(c[end])) {
                char tmp = c[end];
                c[end] = c[start];
                c[start] = tmp;

                start++;
                end--;
            }else if(!Character.isAlphabetic(c[start])) {
                start++;
            }else if(!Character.isAlphabetic(c[end])){
                end--;
            }
        }

        return new String(c);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String result = solution(str);
        System.out.println(result);
    }
}
