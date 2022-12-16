package com.learnJava.streams.av;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
         list.stream().map(e -> e + "").filter(e -> e.startsWith("1")).forEach(System.out::println);
    }
}
