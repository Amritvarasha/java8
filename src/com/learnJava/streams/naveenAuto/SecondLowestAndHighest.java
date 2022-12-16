package com.learnJava.streams.naveenAuto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestAndHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,8,1,2,234,867,890,432,432,222,222);
        Integer secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        Integer secondLowest = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();


    }
}
