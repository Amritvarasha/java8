package com.learnJava.streams.naveenAuto;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,8,234,867,890,432,432,222,222);
        List<Integer> list2 = Arrays.asList(8,8,234,867,890,432,432,222,222);
list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
        Set<Integer> set = list.stream()
                .filter(e -> Collections.frequency(list, e) > 1)
                .collect(Collectors.toSet());
        System.out.println("Duplicates are"+set);
        //method 2
        Set<Integer> dupNum = new HashSet<>();
        Set<Integer> collect2 = list2.stream()
                .filter(e -> !dupNum.add(e))
                .collect(Collectors.toSet());
        System.out.println("Duplicates 2 are "+collect2);

    }
}
