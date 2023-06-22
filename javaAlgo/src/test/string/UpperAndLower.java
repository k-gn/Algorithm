package test.string;

import java.util.Scanner;

public class UpperAndLower {
	public static String solution(String str) {

		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i)))
				answer.append(Character.toUpperCase(str.charAt(i)));
			else
				answer.append(Character.toLowerCase(str.charAt(i)));
		}

		return answer.toString();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		System.out.println(solution(str));
	}
}
