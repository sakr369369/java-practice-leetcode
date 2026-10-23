package com.java.Scanner;

import java.util.*;

public class ListbyScannerdynamic {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of  Employee:");
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            System.out.println("Enter the Employee "+(i + 1) + " details.");
            System.out.print("Id : ");

            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age : ");
            int age = sc.nextInt();

            System.out.print("Salary : ");

            double salary = sc.nextDouble();
            list.add(new Employee(id, name, age, salary));
        }
        System.out.println("List ===> "+ list);
        //---------------------Emp Name
        List<String> listName = ListOfEmpByNasmeLimit.getEmpName(list, 2);
        System.out.println(listName);
    }

}


class Employee{
    private int id;
    private  String name;
    private int age;
    private  double salay;

    public Employee(int id, String name, int age, double salay) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salay = salay;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalay() {
        return salay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salay=" + salay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Double.compare(salay, employee.salay) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salay);
    }
}