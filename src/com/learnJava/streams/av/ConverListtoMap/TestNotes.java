package com.learnJava.streams.av.ConverListtoMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNotes {
    public static void main(String[] args) {
        List<Notes> notLst = new ArrayList<>();
        notLst.add(new Notes(1,"note1",11));
        notLst.add(new Notes(2,"note2",22));
        notLst.add(new Notes(3,"note3",33));
        notLst.add(new Notes(4,"note4",44));
        notLst.add(new Notes(5,"note5",55));
        notLst.add(new Notes(6,"note4",66));
        Map<String, Long> collect = notLst.stream().collect(Collectors.toMap(Notes::getTagName, Notes::getTagId,
                (oldValue, newValue) -> oldValue)
        );
        System.out.println("Notes:"+collect);

    }
}
