package leetcode.Arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String test = "\"app\", \"items.price.cid\"";
        String[] split = test.split("\\[]");
        System.out.println(Arrays.toString(split));
    }
}