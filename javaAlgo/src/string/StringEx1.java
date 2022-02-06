package string;

import java.util.HashMap;

// 문자열안에 문자가 고유한지 확인 (중복 확인)
public class StringEx1 {
    public static void main(String[] args) {

    }

    public static boolean isUnique(String str) {
        if(str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for(int i=0; i<str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static boolean isUniqueByMap(String str) {

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            int c = str.charAt(i);

            if(hashMap.containsKey(c)) {
                return false;
            }
            hashMap.put(c, true);
        }

        return true;
    }
    
    // 문자열이 'a' ~ 'z' 문자 조합이라 가정할 경우
    public static boolean isUniqueByShift(String str) {
        int checker = 0;
        for(int i=0; i<str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }
        return true;
    }

    // 그냥 문자열의 앞 문자부터 차례대로 반복해서 검사할수도 있음 (O(N^2))
    // 퀵 정렬일 경우 O(N log N)
}
