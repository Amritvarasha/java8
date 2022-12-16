package com.learnJava.streamsEG;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;


public class GroupEmployee {
    public static void main(String[] args) {
        List<Employee1> emplist = new ArrayList<>();
        emplist.add(new Employee1(101,"siva",101,"active",2000));
        emplist.add(new Employee1(102,"reddy",101,"active",5000));
        emplist.add(new Employee1(103,"raju",102,"inactive",6000));
        emplist.add(new Employee1(104,"sivam",102,"inactive",4000));
        emplist.add(new Employee1(105,"bob",103,"active",3500));
        emplist.add(new Employee1(106,"alice",103,"inactive",3500));
        emplist.add(new Employee1(107,"sinu",104,"active",3500));

        Map<Integer, List<Employee1>> emplistBasedOnID = emplist.stream().collect(Collectors.groupingBy(Employee1::getDeptId, Collectors.toList()));
        emplistBasedOnID.entrySet().forEach(emp-> {
            System.out.println(emp.getKey()+"... "+emp.getValue());
        });
        Map<Integer, Long> empcount =  emplist.stream().collect(Collectors.groupingBy(Employee1::getDeptId,Collectors.counting()));
        empcount.entrySet().forEach(empl->{
            System.out.println(empl.getKey()+"..."+empl.getValue());
        });
        long activeEmpCout = emplist.stream().filter(e-> "active".equals(e.getStatus())).count();
        long iactiveEmpCout = emplist.stream().filter(e-> "inactive".equals(e.getStatus())).count();
        System.out.println("Active Emp count "+activeEmpCout);
        System.out.println("Inactive Emp count "+iactiveEmpCout);
        Optional<Employee1> salary = emplist.stream().max(Comparator.comparing(Employee1::getSalary));
        Optional<Employee1> minsalary = emplist.stream().min(Comparator.comparing(Employee1::getSalary));
        System.out.println("Max Salary "+salary);
        System.out.println("Min salary "+minsalary);
        Map<Integer, Optional<Employee1>> topsalaryBydeptEmp = emplist.stream().collect(Collectors.groupingBy(Employee1::getDeptId,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee1::getSalary)))));
        topsalaryBydeptEmp.entrySet().forEach(e->{
            System.out.println(e.getKey()+"..."+e.getValue());
        });


    }
}
