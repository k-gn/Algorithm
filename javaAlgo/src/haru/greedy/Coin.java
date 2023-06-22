package haru.greedy;

import java.util.Scanner;

// 매 순간 최적이라 생각되는 값을 선택
public class Coin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price = scan.nextInt();
		int count = 0;
		int coins[] = {500, 100, 50, 10};

		for (int coin : coins) {
			count += price / coin;
			price %= coin;
		}

		System.out.println("count = " + count);
	}
}
