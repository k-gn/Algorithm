package haru.BinarySearch;

public class BinarySearch {

	static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};

	// 재귀적 탐색
	static int binarySearch1(
		int key,
		int left,
		int right
	) {
		// 원하는 값을 찾지 못함.
		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;

		// 원하는 값을 찾았다면 그 위치를 반환.
		if (key == arr[mid]) {
			return mid;
		}

		if (key > arr[mid]) {
			return binarySearch1(key, mid + 1, right);
		}
		return binarySearch1(key, left, mid - 1);
	}

	// 반복적 탐색
	static int binarySearch2(
		int key,
		int left,
		int right
	) {
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1; // 탐색 실패
	}
}
