package com.learnJava.streams.naveenAuto;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1,2,3,4,5,6,7,8);
        double asDouble = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("abg is " + asDouble);
    }
}
