package haru.quiz.array;

import java.util.Scanner;

/*
	N개의 숫자가 공백없이 써있다. 숫자를 모두 합해 출력하는 프로그램
	- 1번째 줄에 숫자의 개수 N(1 <= N <= 100) 2번째 줄에 숫자 N개가 공백없이 주어진다.
 */
public class 숫자_합_구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String number = sc.next();
		char[] numbers = number.toCharArray();

		int sum = 0;
		for (char n : numbers) {
			sum += n - '0';
		}

		System.out.println("sum = " + sum);
	}
}
