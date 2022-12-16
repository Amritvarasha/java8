package com.learnJava.streams.naveenAuto;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAvg {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,20,30,15);
        double asDouble = list.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println("result is "+asDouble);
    }

}
