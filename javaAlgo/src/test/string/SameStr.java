package test.string;

import java.util.Scanner;

// 회문
public class SameStr {
    public static String solution(String str) {

        boolean flag = false;
        int start = 0;
        int end = str.length() - 1;
        str = str.toLowerCase();
        while(start < end) {
            if(Character.toLowerCase(str.charAt(start)) == Character.toLowerCase(str.charAt(end))) {
                start++;
                end--;
            }else {
                break;
            }
        }

        if(start >= end) flag = true;

        return flag ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String result = solution(str);
        System.out.println(result);
    }
}
