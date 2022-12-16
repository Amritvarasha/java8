package leetcode.String;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static void main(String[] args) {
        String num = "00110110";
        int size = 2;
        boolean result = hasAllCodes(num, size);
    }

    private static boolean hasAllCodes(String num, int size) {
        int count = 0;
        int start = 0;
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < num.length(); i++) {
            count++;
            if (count == size) {
                hashSet.add(num.substring(start, size + start));
                count--;
                start++;
            }


        }
        return hashSet.size()==Math.pow(2,size);
    }
}
