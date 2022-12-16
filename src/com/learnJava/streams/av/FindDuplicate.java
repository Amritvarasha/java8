package com.learnJava.streams.av;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        myList.stream()
                .filter(e-> !set.add(e))
                .forEach(e->System.out.println(e));

    }
}
