package com.tnsif.Demo.Day14.Collections.SetCollections.SortedSetDemo;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SortedTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 40000));

        System.out.println("Sorted Employees: " + employees);
    }
}