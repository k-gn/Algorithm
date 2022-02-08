package test.string;

import java.util.Scanner;

public class FindStringInWord {

    public static String solution(String str) {

        String[] list = str.split(" ");
        String answer = "";
        for(String s : list) {
            if(s.length() > answer.length()) answer = s;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(solution(str));
    }
}
