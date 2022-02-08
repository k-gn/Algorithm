package test.string;

import java.util.Scanner;

public class AuthStr {
    public static String solution(String str, int n) {

        String answer = "";

        for(int i=0; i<n; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2);
            System.out.println("tmp : " + tmp);
            System.out.println("num : " + num);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = scanner.nextInt();

        String answer = solution(str, n);
        System.out.println(answer);
    }
}
