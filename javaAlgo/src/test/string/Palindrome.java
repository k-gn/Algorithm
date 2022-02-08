package test.string;

import java.util.Scanner;

public class Palindrome {
    public static String solution(String str) {

        boolean flag = false;
        str = str.toLowerCase();

        StringBuilder builder = new StringBuilder();
        char[] cList = str.toCharArray();

        for(char c : cList) {
            if(Character.isAlphabetic(c)) {
                builder.append(c);
            }
        }

        String str1 = builder.toString();
        String str2 = builder.reverse().toString();

        if(str1.equals(str2)) flag = true;
        return flag ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String result = solution(str);
        System.out.println(result);
    }
}
