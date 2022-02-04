package bit;

public class BitCalcEx1 {
    public static void main(String[] args) {

        int num = 9;
        int i = 3;

        System.out.println(getBit(num, i));
        System.out.println(setBit(5, 3)); // 0 1 0 1 -> 1 1 0 1
    }
    // 2진수 num의 i번째 인덱스의 값 구하기
    public static boolean getBit(int num, int i) {

        // 1 << i => ex) i=3 -> i << i = 1 0 0 0
        // num & n => ex) num = 9 -> 1 0 1 0
        //                         & 1 0 0 0
        //                         ------------
        //                           1 0 0 0
        return (num & (1 << i)) != 0;
    }

    // 2진수 num의 i번째 값을 1로 변경하기
    public static int setBit(int num, int i) {
        return num | (1 << i);
    }

    // 2진수 num의 i번째 값을 0로 변경하기
    public static int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

    // i번째 인덱스를 포함한 왼쪽은 0 오른쪽은 그대로
    public static int clearLeftBits(int num, int i) {
        return num & ((1 << i) - 1);
    }

    // i번째 인덱스를 포함한 왼쪽은 1 오른쪽은 0
    public static int clearRightBits(int num, int i) {
        return num & (-1 << (i + 1));
    }

    // bit update
    public static int updateBit(int num, int i, boolean val) {
        return num & ~(1 << i) | ((val ? 1 : 0) << i);
    }
}
