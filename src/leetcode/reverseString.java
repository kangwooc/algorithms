package leetcode;

public class reverseString {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        char[] p = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            p[i] = ch[ch.length - i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p.length; i++) {
            sb.append(p[i]);
        }
        return sb.toString();
    }
}
