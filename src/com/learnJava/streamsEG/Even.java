package com.learnJava.streamsEG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Even {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15,8,25);
        myList.stream().filter(e->e%2==0).forEach(System.out::println);
        System.out.println("*********");
        myList.stream().map(e->e+"").filter(num->num.startsWith("1")).forEach(System.out::println);
        System.out.println("find duplicates in integer list");
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n->!set.add(n)).forEach(System.out::println);
        System.out.println("find the first element of the list");
        myList.stream().findFirst().ifPresent(System.out::println);
        System.out.println("find the total count in the list");
        System.out.println(myList.stream().count());

    }
}
