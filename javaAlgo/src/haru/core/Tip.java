package haru.core;

public class Tip {

	/*
		1. int 보단 long 을 사용하자.
		2. 입력 데이터가 많다면 Scanner 보다 BufferedReader 가 성능이 좋다.
			- Scanner sc = new Scanner(System.in);
			  int a = sc.nextInt();

			- BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  StringTokenizer st = new StringTokenizer(br.readLine());
			  int a = Integer.parseInt(st.nextToken());
		3. i++, ++i
		4. 오름차순
			- int[] a = {3, 2, 1};
			  Arrays.sort(a);

		   내림차순
		   - Integer[] a = {1, 2, 3};
		   	 Arrays.sort(a, Collections.reverseOrder();

		   	 또는

		   	 int[] a = {1, 2, 3};
		   	 Integer[] tmp = Arrays.stream(a).boxed().toArray(Integer[]::new);
		   	 Arrays.sort(tmp, Collections.reverseOrder();

		   	 또는

		   	 int[] a = {-1, -2, -3}; // -1 을 곱한 후 오름차선 처리
		   	 Arrays.sort(a); // 출력 시 -1 을 다시 한번 곱하기

		 5. Comparable
		 	- ex. 영어, 수학 점수로 데이터 정렬하기
		 		- Comparable<T> 을 구현 후 compareTo 메소드를 재정의하기
		 		- return 값 : 매개변수 데이터가 더 클 때 양수 리턴은 오름차순, 음수 리턴은 내림차순
		 		- 정렬 방향을 바꾸고 싶다면 계산하는 두 데이터의 위치를 바꾼다.

			ArrayList<Score> a = new ArrayList<>();
			Collections.sort(a);

		6. static
		7. for(범위 반복, 고정), while(조건반복, 변동) - 빈복 형태에 따라 적절히 사용하면 된다.0
		8. if, switch (if 가 좀 더 친숙하게 사용된다)
		9. 정답을 xx 로 나눈 나머지를 출력
			- mod 연산의 특성을 이용 (분배법칙 - 덧셈, 뺼셈, 곱셉만 가능) -> ex. (A + B) % C = (A % C + B % C) % C
			- 정답이 변수가 표현하는 범위를 넘어가는 경우가 존재할 수 있음
			- 정답을 구하고 % 연산을 하는게 아니라 step 마다 % 연산을 하면서 풀어야 한다.

		10. ArrayList
	 */
}
