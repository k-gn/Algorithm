package string;

// 회문의 치환인지 확인 O(N)
public class StringEx4 {

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome2("aa bb cc dd"));
        System.out.println(isPermutationOfPalindrome2("aa bb cc dd e"));
        System.out.println(isPermutationOfPalindrome2("aa bb cc dd e fff"));
    }

    // 회문을 만들 수 있는지? (하나를 제외한 모든 문자가 짝수개인지 확인)
    private static boolean isPermutationOfPalindrome(String s) {
        int[] table = buildCharFrequencyTable(s);
        return checkMaxOneOdd(table);
    }

    private static int[] buildCharFrequencyTable(String s) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1]; // a ~ z 크기의 방

        for(char c : s.toCharArray()) {
            int x = getCharNumber(c);
            if(x != -1) {
                table[x]++;
            }
        }

        return table;
    }

    // 홀수개 문자가 두개 이상인지 확인
    private static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for(int count : table) {
            if(count % 2 == 1) {
                if(!foundOdd) {
                    foundOdd = true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if(a <= val && val <= z) {
            return val - a; // 인덱스 방에 담기 위한 값
        }
        return -1;
    }

    // 한번에 확인하기
    private static boolean isPermutationOfPalindrome2(String s) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c : s.toCharArray()) {
            int x = getCharNumber(c);
            if(x != -1) {
                table[x]++;
                if(table[x] % 2 == 1) {
                    countOdd++;
                }else {
                    countOdd--;
                }
                System.out.println("countOdd : " + countOdd);
            }
        }
        return countOdd <= 1;
    }
}
