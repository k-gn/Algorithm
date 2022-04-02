import java.util.Scanner;

public class Main {

    public static boolean solution(int a, int b, int c, int d, int e, int f) { // 4 4 0 2 1 2
        boolean answer = false;
        int prevSum = a + b + c; // 초기 구슬의 합  8
        int resultSum = d + e + f; // 합성 구슬의 합  5

        if((prevSum - 1) <= resultSum) return answer;

        while(prevSum > resultSum) { // 합성해서 같은 수의 합이 나올 수 있는지 판별
            prevSum -= 1;

            if(prevSum == resultSum) {
                answer = true;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4,4,0,2,1,2));
        System.out.println(solution(3,3,3,2,2,2));
        System.out.println(solution(2,2,1,1,1,2));
        System.out.println(solution(3,2,1,1,3,1));
    }
}
