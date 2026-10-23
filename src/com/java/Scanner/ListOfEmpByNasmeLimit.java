package com.java.Scanner;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfEmpByNasmeLimit {
    public static List<String> getEmpName(List<Employee> emp, int limit){

        return emp.stream().map(e -> e.getName()).limit(limit).collect(Collectors.toList());
    }
}
