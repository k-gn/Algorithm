package test.string;

import java.util.Scanner;

public class CompressStr {
    public static String solution(String str) {

        String answer = "";

        int count = 1;

        for(int i=0; i<str.length(); i++) {
            if(i != str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }else {
                if(count == 1) answer += "" + str.charAt(i);
                else answer += "" + str.charAt(i) + count;
                count = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String answer = solution(str);
        System.out.println(answer);
    }
}
