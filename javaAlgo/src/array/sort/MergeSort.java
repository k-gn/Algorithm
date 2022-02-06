package array.sort;

public class MergeSort {

    public static int[] src;
    public static int[] tmp;

    public static void main(String[] args) {
        src = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
        tmp = new int[src.length];
        printArray(src);
        mergeSort(0, src.length - 1);
        printArray(src);

    }

    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            // 중앙을 기준으로 2개의 그룹으로 분할 과정
            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            // 정렬 후 병합 과정
            int p = start; // 왼쪽 그룹의 시작
            int q = mid + 1; // 오른쪽 그룹의 시작
            int idx = p; // 병합된 배열의 위치
            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && src[p] < src[q])) {
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }
            for (int i = start; i <= end; i++) {
                src[i] = tmp[i];
            }
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();
    }


}
