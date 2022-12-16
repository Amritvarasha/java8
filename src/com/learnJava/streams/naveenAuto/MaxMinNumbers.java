package com.learnJava.streams.naveenAuto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-8,8,234,867,890,432,432,222,222);
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);

    }
}
