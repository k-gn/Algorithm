package test.string;

import java.util.Scanner;

public class RemoveDupStr {
    public static String solution(String str) {

        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String result = solution(str);
        System.out.println(result);
    }
}
