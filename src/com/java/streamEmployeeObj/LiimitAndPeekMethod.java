package com.java.streamEmployeeObj;

import java.util.EmptyStackException;
import java.util.List;
import java.util.stream.Collectors;

public class LiimitAndPeekMethod {

    public static void main(String[] args) {
        List<Employee> list= EmployeeUtil.getEmployeeList();

        System.out.println(list);

        List<String> limitList = list.stream().map(e ->e.getName()).limit(2).collect(Collectors.toList());
        System.out.println(limitList);

        List<String> pickList = list.stream().map(e ->e.getName()).skip(2).collect(Collectors.toList());
        System.out.println(pickList);

    }

}

