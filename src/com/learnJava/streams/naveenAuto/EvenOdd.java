package com.learnJava.streams.naveenAuto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,2,3,45,67,9,90,87,8,2,0);
        List<Integer> list1 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("even number are"+list1);
        List<Integer> list2 = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd number are"+list2);

    }
}
