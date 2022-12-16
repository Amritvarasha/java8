package com.learnJava.streams.av;

import java.util.ArrayList;
import java.util.List;

public class SortAlList {
    int id;
    String name;
    int slot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public SortAlList(int id, String name, int slot) {
        this.id = id;
        this.name = name;
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "SortAlList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slot=" + slot +
                '}';
    }

    public static void main(String[] args) {
        List<SortAlList> al = new ArrayList<>();
        al.add(new SortAlList(1,"aa",11));
        al.add(new SortAlList(3,"cc",33));
        al.add(new SortAlList(4,"bb",44));
        al.add(new SortAlList(2,"dd",34));
        al.add(new SortAlList(5,"zz",32));
        al.sort((n1,n2)->n1.getId()-n2.getId());
        al.forEach(System.out::println);


    }
}
