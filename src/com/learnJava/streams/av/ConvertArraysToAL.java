package com.learnJava.streams.av;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArraysToAL {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(collect);
        int[] ints = Arrays.stream(a).boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
    }
}

