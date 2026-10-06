package com.java.streamEmployeeObj;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeUtil {
    public static void main(String[] args) {
        Map<Integer, Employee> empMap =  getEmployeeMapObj();
        System.out.println(empMap);
    }

    public static List<Employee> getEmployeeList() {

        List<Employee> list = Arrays.asList(
                new Employee(102, "Pramod", "IT", 300000),
                new Employee(102, "Krisha", "HR", 500000),
                new Employee(103, "Shivansh", "IT", 450000),
                new Employee(104, "Snavi", "IAS", 800000),
                new Employee(105, "Shashi", "HR", 100000)
        );

        return list;
    }

    public static Map<Integer, Employee> getEmployeeMapObj(){
        List<Employee> list = getEmployeeList();
        System.out.println(list);

        return  list.stream().collect(Collectors.toMap(Employee::getId, Function.identity(), (e1, e2)->e2 ));
    }

    public static List<Employee>  converMapToListEmpObj (){
        Map<Integer, Employee> empMap = getEmployeeMapObj();

        return   empMap.values().stream().toList();
    }
}
