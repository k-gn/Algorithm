package haru.inf.str;

import java.util.Scanner;

public class 문자거리 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		char t = scanner.nextLine().charAt(0);

		int[] distances = calculateMinDistances(s, t);
		for (int distance : distances) {
			System.out.print(distance + " ");
		}
	}

	private static int[] calculateMinDistances(
		String s,
		char t
	) {
		int n = s.length();
		int[] distances = new int[n];
		int prev = -n;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == t) {
				prev = i;
			}
			distances[i] = i - prev;
		}

		prev = 2 * n;
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == t) {
				prev = i;
			}
			distances[i] = Math.min(distances[i], prev - i);
		}

		return distances;
	}
}
