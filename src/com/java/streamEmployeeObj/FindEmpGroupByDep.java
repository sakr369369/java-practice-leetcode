package com.java.streamEmployeeObj;

import java.util.List;
import  java.util.Map;
import java.util.stream.Collectors;

public class FindEmpGroupByDep {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeUtil.getEmployeeList();

        Map<String, List<Employee>>  empMapGroupbyDep =  empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
