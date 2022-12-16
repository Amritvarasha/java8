package com.learnJava.streams.naveenAuto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,-822,234,867,890,432,236,211,22);
        List<Integer> list1 = list.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("8"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("final result list is"+list1);
    }
}
