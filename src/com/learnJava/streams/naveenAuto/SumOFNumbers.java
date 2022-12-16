package com.learnJava.streams.naveenAuto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOFNumbers {
    public static void main(String[] args) {
        List<Integer> numlist = Arrays.asList(1,4,5,6,7,8);
        Optional<Integer> sum = numlist.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of numbers is "+sum.get() );
    }
}
