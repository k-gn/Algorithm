package haru.inf.str;

import java.util.Scanner;

/*
	1. 문자 갯수 찾기
 */
public class Finder {

	public int solution(
		String str,
		char t
	) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for (char x : str.toCharArray()) {
			if (x == t)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Finder finder = new Finder();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.print(finder.solution(str, c));
	}
}
