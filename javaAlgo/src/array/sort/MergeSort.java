package array.sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] tmp;

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 4, 5, 6 ,8 };
        mergeSort(arr);
        printArray(arr);

    }

    public static void mergeSort(int[] arr) {
        tmp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        // 원소가 2개 이상이라면
        if(start < end) {
            // 중앙 값을 구하고
            int mid = (start + end) / 2;
            // 중앙을 기준으로 2개의 그룹으로 분할
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            // 정렬 후 병합
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        // 배열 복사
        tmp = arr.clone();

        /*
         * part1: 왼쪽 그룹의 시작 인덱스
         * part2: 오른쪽 그룹의 시작 인덱스
         * index: 정렬된 값을 병합된 배열의 어떤 위치에 넣어야하는 지
         */
        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        System.out.println("==================================");
        System.out.println("start : " + start);
        System.out.println("end : " + end);
        System.out.println("mid : " + mid);
        System.out.println("==================================");
        System.out.println("part1 : " + part1);
        System.out.println("part2 : " + part2);
        System.out.println("index : " + index);
        System.out.println("tmp : " + Arrays.toString(tmp));
        System.out.println("==================================");
        // 두 그룹중 한쪽의 원소가 끝날때까지 반복 (정렬 & 합병)
        while(part1 <= mid && part2 <= end) {
            if(tmp[part1] <= tmp[part2]) {
                arr[index++] = tmp[part1++];
            } else {
                arr[index++] = tmp[part2++];
            }
        }

        // 왼쪽 그룹의 원소가 남는 경우 처리
        // (오른쪽 그룹의 원소가 남는 경우는 따로 처리하지 않아도 된다)
        for(int i=0; i<=mid-part1; i++) {
            arr[index+i] = tmp[part1+i];
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();
    }


}
