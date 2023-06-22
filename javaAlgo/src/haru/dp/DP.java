package haru.dp;

import java.util.Scanner;

public class DP {

	static long[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new long[n + 1];
		// 기저 조건을 바탕으로 초항을 먼저 초기화 해둔다.
		dp[1] = 1;
		dp[2] = 1;

		// n번째 피보나치 수를 구하고 출력하라.
		System.out.println(Fibonacci(n));
		sc.close();
	}

	// 동일한 부분문제에 대해 계속 계산할 필요가 없다. (재귀보다 빠르다.)
	private static long Fibonacci(int n) {
		// 기저 조건을 기반으로 테이블을 채워나간다(Tabulation).
		for(int i = 3; i <= n; i++) {
			// 점화식을 이용하여 쉽게 구할 수 있다.
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}
}
