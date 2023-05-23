package haru.quiz.array;

/*
	# 백준 온라인 저지 2018번
 */
public class 연속된_자연수_합_구하기 {

	// 투 포인터
	public static void main(String[] args) {
		int number = 15;
		int start = 1;
		int end = 1;
		int count = 1;
		int sum = 1;

		while (end != number) {
			if (sum == number)
				count++;

			if (sum > number) {
				sum -= start;
				start++;
			} else {
				end++;
				sum += end;
			}
		}

		System.out.println(count);
	}

}
