package haru.inf.str;

import java.util.Scanner;

public class 회문문자열 {

	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				answer = "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		회문문자열 T = new 회문문자열();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
