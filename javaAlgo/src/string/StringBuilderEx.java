package string;

class StringBuilder {
    private char[] value;
    private int size;
    private int index;

    StringBuilder() {
        size = 1;
        value = new char[size];
        index = 0;
    }

    public void append(String str) {
        if(str == null) str = "null";
        int len = str.length();
        ensureCapacity(len);

        for(int i=0; i<str.length(); i++) {
            value[index] = str.charAt(i);
            index++;
        }
    }

    public void ensureCapacity(int len) {
        if(index + len > size) {
            size = (size + len) * 2;
            char[] newVal = new char[size];
            for(int i=0; i< value.length; i++) {
                newVal[i] = value[i];
            }
            value = newVal;
        }
    }

    public String toString() {
        return new String(value, 0, index);
    }
}

public class StringBuilderEx {
    public static void main(String[] args) {

    }
}
