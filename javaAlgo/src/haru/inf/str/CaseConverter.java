package haru.inf.str;

import java.util.Scanner;

/*
	# 대소문자 변환
 */
public class CaseConverter {
	public String solution(String str) {
		StringBuilder answer = new StringBuilder();
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x))
				answer.append(Character.toUpperCase(x));
			else
				answer.append(Character.toLowerCase(x));

		}
		return answer.toString();
	}

	public static void main(String[] args) {
		CaseConverter T = new CaseConverter();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
