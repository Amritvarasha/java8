package com.learnJava.streams.naveenAuto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,8,234,867,890,432,432,222,222);
        List<Integer> limitlist = list.stream().limit(5).collect(Collectors.toList());
        System.out.println("limit list is"+limitlist);
        Integer sum = list.stream().limit(5).reduce((a, b) -> a + b).get();
        System.out.println("sum is "+sum);
        //skip elements
        List<Integer> skiplist = list.stream().skip(5).collect(Collectors.toList());
        System.out.println("after skipping the list is  "+skiplist);



    }
    
    
}
