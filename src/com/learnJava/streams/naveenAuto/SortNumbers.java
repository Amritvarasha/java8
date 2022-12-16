package com.learnJava.streams.naveenAuto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,8,234,867,890,432,432,222,222);
        List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list is"+asc);
        List<Integer> desc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("sorted list is"+desc);


    }
}
