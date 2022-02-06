package string;


// 단 한번만 편집된 문자열인지 확인하기
public class StringEx5 {
    public static void main(String[] args) {

        System.out.println(isOneAway("pale", "palss"));
    }

    private static boolean isOneAway(String s1, String s2) {
        String ss, ls;
        if(s1.length() < s2.length()) {
            ss = s1;
            ls = s2;
        }else {
            ss = s2;
            ls = s1;
        }

        System.out.println("small : " + ss);
        System.out.println("long : " + ls);

        if(ls.length() - ss.length() > 1) return false;
        boolean flag = false;
        for(int i=0, j=0; i<ss.length(); i++, j++) {
            if(ss.charAt(i) != ls.charAt(j)) {
                if(flag) {
                    return false;
                }
                flag = true;
            }
        }
        if(flag) {
            if(ss.length() != ls.length()) {
                return false;
            }
        }
        return true;
    }
}
