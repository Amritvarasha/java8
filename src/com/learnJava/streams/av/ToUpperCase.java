package com.learnJava.streams.av;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("aa","bb","cc","dd");
        List<String> collect = al.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }
}
