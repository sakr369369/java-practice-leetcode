package com.java.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> listEmp =new ArrayList<>();
        listEmp.add(new Employee(102, "Pramod", "IT", 50000));
        listEmp.add(new Employee(105, "Sanvi", "HR", 90000));
        listEmp.add(new Employee(107, "Shashi", "IT", 30000));
        listEmp.add(new Employee(109, "Krisha", "IAS", 150000));

        ListToMap(listEmp);
        sortEmpBySalary(listEmp);

    }

    public static void ListToMap(List<Employee> listEmp){
        Map<Integer, Employee> map =    listEmp.stream().collect(Collectors.toMap(o-> o.getId(), o-> o));
        Map<Integer, Employee> map2 =    listEmp.stream().collect(Collectors.toMap(Employee::getId, Function.identity(), (e1, e2) -> e1));

        System.out.println(map);

        System.out.println(map2);

    }

    public static void sortEmpBySalary(List<Employee> listEmp){
        List<Employee> listEmpSortedAscOrder = listEmp.stream().sorted(Comparator.comparing(Employee::getSalay)).collect(Collectors.toList());
        System.out.println(listEmpSortedAscOrder);

        List<Employee> listEmpSortedDescOrder= listEmp.stream().sorted(Comparator.comparing(Employee::getSalay).reversed()).collect(Collectors.toList());
        System.out.println(listEmpSortedDescOrder);
    }
}

class Employee{
    private int id;
    private String name;
    private String dept;
    private int salay;

    public Employee(int id, String name, String dept, int salay) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salay = salay;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalay() {
        return salay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salay=" + salay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salay == employee.salay && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept, salay);
    }
}
