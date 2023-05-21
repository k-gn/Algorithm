package haru.quiz.array;

import java.util.Scanner;

/*
	백준 온라인 저지 1546번
 */
public class 평균_구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sum += num;

			if (num > max)
				max = num;
		}

		System.out.println(sum * 100.0 / max / n);
	}
}
